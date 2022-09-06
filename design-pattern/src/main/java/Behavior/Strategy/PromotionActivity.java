package Behavior.Strategy;

/**
 * 这个是切换策略的上下文
 * @author : Woods
 * @ClassName : PromotionActivity
 * @date : 2022/2/20  10:37 下午
 * @Version ：1.0
 */
public class PromotionActivity {
    private IPromotionStrategy strategy;

    public PromotionActivity(IPromotionStrategy strategy) {
        this.strategy = strategy;
    }

    public void execute() {
        strategy.doPromotion();
    }
}
