package Behavior.chain;

/**
 * @author : Woods
 * @ClassName : Handler
 * @date : 2022/2/28  9:13 上午
 * @Version ：1.0
 */
public abstract class Handler<T> {
    protected Handler<T> chain;

    /**
     * 指明下一个验证条件是什么
     * @param handler 验证条件
     */
    void setNext(Handler<T> handler) {
        this.chain = handler;
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
        private Handler<T> head;
        private Handler<T> tail;

        public Builder<T> addHandler(Handler<T> handler) {
            //如果还没有头, 就让该handler作为头和尾,
            if (this.head == null) {
                this.head = this.tail = handler;
                return this;
            }
            //如果是有头的话,
            this.tail.setNext(handler);
            this.tail = handler;
            return this;
        }
        //返回链的头
        public Handler<T> builder() {
            return this.head;
        }
    }
}
