package Create.Singleton;

/**
 * 线程不安全的懒汉模式
 * @author : Woods
 * @ClassName : LazySimpleSingleton
 * @date : 2022/9/8  11:23 上午
 * @Version ：1.0
 */
public class LazySimpleSingleton {
    private LazySimpleSingleton() {

    }
    private static LazySimpleSingleton lazySimpleSingleton = null;

    public static LazySimpleSingleton getInstance() {
        if (lazySimpleSingleton == null) {
            lazySimpleSingleton = new LazySimpleSingleton();
        }
        return lazySimpleSingleton;
        }
}
