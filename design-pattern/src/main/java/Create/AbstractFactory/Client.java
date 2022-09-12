package Create.AbstractFactory;

/**
 * @author : Woods
 * @ClassName : Client
 * @date : 2022/9/7  9:11 上午
 * @Version ：1.0
 */
public class Client {
    public static void main(String[] args) {

        //华为工厂的A,B产品的生产
        IAbstractFactory abstractFactory = new ConcreteFactoryHuawei();
        abstractFactory.makeProductA().doA();
        abstractFactory.makeProductB().doB();

        //小米工厂的A,B产品的生产
        abstractFactory = new ConcreteFactoryXiaomi();
        abstractFactory.makeProductA().doA();
        abstractFactory.makeProductB().doB();

    }
}
