package behavior.strategy;

/**
 * 团购抵扣
 * @author : Woods
 * @ClassName : GroupBuyStrategy
 * @date : 2022/2/20  8:49 下午
 * @Version ：1.0
 */
public class GroupBuyStrategy implements IPromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("团购抵扣");
    }
}
