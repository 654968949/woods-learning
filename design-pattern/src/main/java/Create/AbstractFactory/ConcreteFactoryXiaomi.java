package Create.AbstractFactory;

/**
 * 小米工厂
 * @author : Woods
 * @date : 2022/9/7  2:42 下午
 * @Version ：1.0
 */
public class ConcreteFactoryXiaomi extends IAbstractFactory{
    /*
        小米工厂可以生产A产品
        也可以生产B产品
     */
    @Override
    protected IProductA makeProductA() {
        super.init();
        return new ConcreteFactoryXiaomiWithProductA();
    }

    @Override
    protected IProductB makeProductB() {
        super.init();
        return new ConcreteFactoryXiaomiWithProductB();
    }
}
