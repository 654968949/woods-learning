package Create.AbstractFactory;

/**
 * @author : Woods
 * @ClassName : ConcreteFactoryHuaweiWithProductA
 * @date : 2022/9/7  3:11 下午
 * @Version ：1.0
 */
public class ConcreteFactoryHuaweiWithProductA implements IProductA{
    @Override
    public void doA() {
        System.out.println("华为工厂生产的A产品");
    }
}
