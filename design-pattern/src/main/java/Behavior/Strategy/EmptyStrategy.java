package Behavior.Strategy;

/**
 * @author : Woods
 * @ClassName : EmptyStrategy
 * @date : 2022/2/20  10:36 下午
 * @Version ：1.0
 */
public class EmptyStrategy implements IPromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("无优惠");
    }
}
