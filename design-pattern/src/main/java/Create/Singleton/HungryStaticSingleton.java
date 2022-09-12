package Create.Singleton;

/**
 * 饿汉式静态块单例模式
 * @author : Woods
 * @ClassName : HungryStaticSingleton
 * @date : 2022/9/8  9:17 上午
 * @Version ：1.0
 */
public class HungryStaticSingleton {
    /**
     * 为什么说饿,因为在JVM加载该类的时候就把对象实例new出来了,下次调的时候直接拿实例对象就可以了
     */
    private static final HungryStaticSingleton hungryStaticSingleton = new HungryStaticSingleton();

    /**
     * 私有化构造方法,其他地方new不出来对象,只能通过我们的getInstance方法获取对象实例
     * 保证了全局单例
     */
    private HungryStaticSingleton() {

    }

    public HungryStaticSingleton getInstacnce() {
        return hungryStaticSingleton;
    }
}
