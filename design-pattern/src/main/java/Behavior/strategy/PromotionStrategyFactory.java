package Behavior.strategy;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * 策略工厂
 * @author : Woods
 * @ClassName : PromotionStrategyFactory
 * @date : 2022/2/20  10:51 下午
 * @Version ：1.0
 */
public class PromotionStrategyFactory {
    /**
     * 装策略类
     */
    private static final Map<String, IPromotionStrategy> STRATEGY_MAP = new HashMap<>();

    static {
        STRATEGY_MAP.put(PromotionKey.CASH_BACK, new CashBackStrategy());
        STRATEGY_MAP.put(PromotionKey.EMPTY, new EmptyStrategy());
        STRATEGY_MAP.put(PromotionKey.GROUP_BUY, new GroupBuyStrategy());
        STRATEGY_MAP.put(PromotionKey.COUPONS, new CouponsStrategy());
    }

    /**
     * 你要什么, 我这个工厂就给你new好的实例
     */
    public IPromotionStrategy getPromotionStrategy(String promotionKey) {
       return Objects.isNull(promotionKey) ? STRATEGY_MAP.get(PromotionKey.EMPTY) : STRATEGY_MAP.get(promotionKey);
    }

    /**
     * 这种方式对于创建型的工厂模式, 不太合适, 既然你都知道要用 xxx.class的字节码类了.
     * 那为何还要用什么工厂模式, 多次一举, 在这个factory里面new实例呢? 直接new不就好了.
     * 所以说用我们上面的getPromotionStrategy方法才更合理
     */
    public  IPromotionStrategy getPromotionStrategyByClass(Class<? extends IPromotionStrategy> clazz) {
        IPromotionStrategy obj = null;
        try {
            obj = (IPromotionStrategy) Class.forName(clazz.getName()).newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return obj;
    }

    public Set<String> getKeys() {
        return STRATEGY_MAP.keySet();
    }

}
