package Behavior.Chain;

/**
 * 责任链和建造者模式结合
 * @author : Woods
 * @ClassName : Handler
 * @date : 2022/2/28  9:13 上午
 * @Version ：1.0
 */
public abstract class Handler {

    /**
     * 下一个元素
     * protected表明只能在此类里面,或者子类里面访问到chainNext
     */
    protected Handler chainNext;

    /**
     * 指明链的下一个元素
     * @param handler 验证条件
     */
    private void setChainNext(Handler handler) {
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
     *
     */
    public static class Builder {
        //整个链的头部元素
        private Handler chainHead;
        //整个链的尾部元素
        private Handler chainTail;

        /**
         * 构建链的核心方法
         * @param handler 链中的元素
         * @return 包装链的Builder
         */
        public Builder addHandler(Handler handler) {
            //如果还没有头, 证明是添加的是第一个元素, 就让该handler作为头和尾,
            if (this.chainHead == null) {
                this.chainHead = this.chainTail = handler;
            }
            //此时这个tail还是上一个元素, 操作上一个元素, 使的从上一个元素可以知晓下一个元素是哪个(这里重点理解)
            this.chainTail.setChainNext(handler);
            //尾部元素重置为该handler, 以便于下一次调用addHandler方法的时候,知道上一次(这里重点理解)
            this.chainTail = handler;
            return this;
        }
        //返回链的头
        public Handler getChainHead() {
            return this.chainHead;
        }
    }
}
