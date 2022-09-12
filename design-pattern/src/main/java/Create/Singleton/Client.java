package Create.Singleton;

/**
 * @author : Woods
 * @ClassName : Client
 * @date : 2022/9/7  11:30 下午
 * @Version ：1.0
 */
public class Client {
    public static void main(String[] args) {
        /*
            单例模式（Singleton Pattern）指确保一个类在任何情况下都绝对只有一个实例，
            并提供一个全局访问点，属于创建型设计模式。
         */
        LazyInnerClassSingleton instance = LazyInnerClassSingleton.getInstance();
        LazyInnerClassSingleton instance2 = LazyInnerClassSingleton.getInstance();
        LazyInnerClassSingleton instance3 = LazyInnerClassSingleton.getInstance();
        LazyInnerClassSingleton instance4 = LazyInnerClassSingleton.getInstance();
        System.out.println(instance);
        System.out.println(instance2);
        System.out.println(instance3);
        System.out.println(instance4);

        EnumSingleton enumSingleton = EnumSingleton.getInstance();
        enumSingleton.doSomething();

    }

}
