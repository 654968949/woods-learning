package behavior.strategy;

/**
 * 电子优惠券策略
 * @author : Woods
 * @ClassName : CouponsStrategy
 * @date : 2022/2/20  8:42 下午
 * @Version ：1.0
 */
public class CouponsStrategy implements IPromotionStrategy {

    @Override
    public void doPromotion() {
        System.out.println("使用电子优惠券抵扣");
    }
}
