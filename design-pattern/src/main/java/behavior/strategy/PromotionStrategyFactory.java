package behavior.strategy;

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


    public IPromotionStrategy getPromotionStrategy(String promotionKey) {
       return Objects.isNull(promotionKey) ? STRATEGY_MAP.get(PromotionKey.EMPTY) : STRATEGY_MAP.get(promotionKey);
    }

    public Set<String> getKeys() {
        return STRATEGY_MAP.keySet();
    }

}
