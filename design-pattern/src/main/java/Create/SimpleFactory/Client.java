package Create.SimpleFactory;

/**
 * @author : Woods
 * @ClassName : Client
 * @date : 2022/9/6  9:28 下午
 * @Version ：1.0
 */
public class Client {
    /*
        简单工厂的工厂是负责所有产品的创建的, 当我们产品基数变得很多的时候, 工厂的代码会变的非常臃肿
     */
    public static void main(String[] args) {
        //创建工厂
        Factory factory = new Factory();
        //生产A产品
        factory.makeProduct(ProductA.class).doSomething();
        //生产B产品
        factory.makeProduct(ProductB.class).doSomething();
        //生产C产品
        factory.makeProduct(ProductC.class).doSomething();
    }
}
