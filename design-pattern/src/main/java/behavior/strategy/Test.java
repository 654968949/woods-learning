package behavior.strategy;

/**
 * @author : Woods
 * @ClassName : Test
 * @date : 2022/2/20  10:40 下午
 * @Version ：1.0
 */
public class Test {
    public static void main(String[] args) {
        //策略模式
        PromotionActivity activity1 = new PromotionActivity(new CouponsStrategy());
        PromotionActivity activity2 = new PromotionActivity(new EmptyStrategy());
        PromotionActivity activity3= new PromotionActivity(new CashBackStrategy());
        activity1.execute();
        activity2.execute();
        activity3.execute();

        //工厂模式加策略模式
        PromotionStrategyFactory factory = new PromotionStrategyFactory();
        IPromotionStrategy promotionStrategy = factory.getPromotionStrategy(PromotionKey.CASH_BACK);
        IPromotionStrategy promotionStrategyByClass = factory.getPromotionStrategyByClass(CashBackStrategy.class);
        promotionStrategy.doPromotion();
        promotionStrategyByClass.doPromotion();
    }
}
