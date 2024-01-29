package Behavior.Strategy;

/**
 * @author : Woods
 * @ClassName : Test
 * @date : 2022/2/20  10:40 下午
 * @Version ：1.0
 */
public class Test {
    public static void main(String[] args) {
        //策略模式
        /*
         * 实现关键 一个接口类,多个策略实现类,运行时动态指定实现类的实例
         */
        PromotionActivity activity1 = new PromotionActivity(new CouponsStrategy());
        PromotionActivity activity2 = new PromotionActivity(new EmptyStrategy());
        PromotionActivity activity3= new PromotionActivity(new CashBackStrategy());
        activity1.execute();
        activity2.execute();
        activity3.execute();

        //工厂模式加策略模式  用一个map存放策略类和类实例的对应关系.相当于一个工厂
        PromotionStrategyFactory factory = new PromotionStrategyFactory();
        IPromotionStrategy promotionStrategy = factory.getPromotionStrategy(PromotionKey.CASH_BACK);
        IPromotionStrategy promotionStrategyByClass = factory.getPromotionStrategyByClass(CashBackStrategy.class);
        promotionStrategy.doPromotion();
        promotionStrategyByClass.doPromotion();
    }
}
