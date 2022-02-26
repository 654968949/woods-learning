package behavior.strategy;

/**
 * 返现策略类
 * @author : Woods
 * @ClassName : CashBackStrategy
 * @date : 2022/2/20  8:50 下午
 * @Version ：1.0
 */
public class CashBackStrategy implements IPromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("返现抵扣");
    }
}
