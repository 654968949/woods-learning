package Behavior.Chain;

/**
 * @author : Woods
 * @ClassName : Handler
 * @date : 2022/2/28  9:13 上午
 * @Version ：1.0
 */
public abstract class Handler<T> {

    /**
     * 下一个元素
     */
    protected Handler<T> chainNext;

    /**
     * 指明链的下一个元素
     * @param handler 验证条件
     */
    void setChainNext(Handler<T> handler) {
        this.chainNext = handler;
    }

    /**
     * 在这个方法里面判断条件是否符合终止条件, 符合就不往下面传递, 不符合就让下一个处理者处理, 直到处理到最后一个
     * @param member 会员实体
     */
    public abstract void doHandler(Member member);

    /**
     * 责任链和建造者模式结合
     * <p>
     *     我自己的认知: 这个Builder就是用来组装责任链的头和尾, Builder里面指明最开始的头和最后的尾
     *     以及指明某个handler的下个验证规则
     * </p>
     * @param <T>
     */
    public static class Builder<T> {
        //Handler元素的头
        private Handler<T> head;
        //Handler元素的尾
        private Handler<T> tail;

        /**
         * 构建链的核心方法
         * @param handler 链中的元素
         * @return 包装链的Builder
         */
        public Builder<T> addHandler(Handler<T> handler) {
            //如果还没有头, 证明是添加的是第一个元素, 就让该handler作为头和尾,
            if (this.head == null) {
                this.head = this.tail = handler;
            }
            //操作上一个元素, 使的从上一个元素可以知晓下一个元素是哪个(这里重点理解)
            this.tail.setChainNext(handler);
            //尾部元素重新为此(这里重点理解)
            this.tail = handler;
            return this;
        }
        //返回链的头
        public Handler<T> builder() {
            return this.head;
        }
    }
}
