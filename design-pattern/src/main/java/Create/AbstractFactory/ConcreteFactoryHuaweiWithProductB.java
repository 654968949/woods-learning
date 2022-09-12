package Create.AbstractFactory;

/**
 * @author : Woods
 * @ClassName : ConcreteFactoryHuaweiWithProductB
 * @date : 2022/9/7  3:11 下午
 * @Version ：1.0
 */
public class ConcreteFactoryHuaweiWithProductB implements IProductB{
    @Override
    public void doB() {
        System.out.println("华为工厂生产的B产品");
    }
}
