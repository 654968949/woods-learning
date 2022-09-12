package Create.Singleton;

import java.util.Objects;

/**
 * 双重检查锁
 *
 * @author : Woods
 * @ClassName : DoubleValidLockSingleton
 * @date : 2022/9/8  6:18 下午
 * @Version ：1.0
 */
public class DoubleValidLockSingleton {
    private DoubleValidLockSingleton(){}

    //线程之间可见
    private volatile static DoubleValidLockSingleton doubleValidLockSingleton = null;

    public static DoubleValidLockSingleton getInstance() {
        //第一重检查:如果实例已经实例化过,直接返回实例化的对象实例
        if (Objects.isNull(doubleValidLockSingleton)) {
            /*
                如果多个线程同时到达这个位置, 那么就可能发生多个线程拿到多个doubleValidLockSingleton引用
                而后返回不同的doubleValidLockSingleton对象实例
             */
            synchronized (DoubleValidLockSingleton.class) {
                /*
                    其实如果两个线程在同一时间都满足if（instance == null）条件，
                    则两个线程都会执行synchronized块中的代码，因此，还是会创建两次
                    所以这里要再次检查是否为空
                 */
                if (doubleValidLockSingleton == null) {
                    doubleValidLockSingleton = new DoubleValidLockSingleton();
                }
                return doubleValidLockSingleton;
            }
        }
        return doubleValidLockSingleton;
    }
}
