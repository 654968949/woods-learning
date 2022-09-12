package Create.Singleton;

/**
 * @author : Woods
 * @ClassName : LazyInnerClassSingleton
 * @date : 2022/9/9  11:22 上午
 * @Version ：1.0
 */
public class LazyInnerClassSingleton {
    /*
        这种方式兼顾了饿汉式单例写法的内存浪费问题和synchronized的性能问题。
        内部类一定要在方法调用之前被初始化，巧妙地避免了线程安全问题。
     */

    private LazyInnerClassSingleton(){}
    //每一个关键字都不是多余的，stat1c是为了使单例模式的空间共享，保证这个方法不会被重写、重载
    public static LazyInnerClassSingleton getInstance() {
        return LazyHolder.INSTANCE;
    }

    //利用了java本身的语法特点,加载类的时候不会主动去加载内部类,除非调用到这个内部类
    private static class LazyHolder {
        private static final LazyInnerClassSingleton INSTANCE = new LazyInnerClassSingleton();
    }

}
