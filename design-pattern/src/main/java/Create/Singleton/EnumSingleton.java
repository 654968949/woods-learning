package Create.Singleton;

/**
 * 枚举单例在JVM启动的时候,就会初始化该类,而且不会被序列化破坏
 * @author : Woods
 * @ClassName : EnumSingleton
 * @date : 2022/9/12  3:16 下午
 * @Version ：1.0
 */
public enum EnumSingleton {
    INSTANCE;

    public void doSomething() {
        System.out.println(INSTANCE);
    }

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }
}
