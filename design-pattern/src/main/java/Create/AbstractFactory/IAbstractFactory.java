package Create.AbstractFactory;

/**
 * 抽象的工厂,包含生产不同产品的方法
 * @author : Woods
 * @ClassName : IAbstractFactory
 * @date : 2022/9/7  2:40 下午
 * @Version ：1.0
 */
public abstract class IAbstractFactory {
    public void init() {
        System.out.println("初始化");
    }
    /**
     * 制造A产品
     */
    protected abstract IProductA makeProductA();
    /**
     * 制造B产品
     */
    protected abstract IProductB makeProductB();
}
