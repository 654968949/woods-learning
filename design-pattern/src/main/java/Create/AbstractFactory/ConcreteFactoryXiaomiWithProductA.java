package Create.AbstractFactory;

/**
 * @author : Woods
 * @ClassName : ConcreteFactoryHuaweiWithProductA
 * @date : 2022/9/7  3:11 下午
 * @Version ：1.0
 */
public class ConcreteFactoryXiaomiWithProductA implements IProductA{
    @Override
    public void doA() {
        System.out.println("小米工厂生产的A产品");
    }
}
