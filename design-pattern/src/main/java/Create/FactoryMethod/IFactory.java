package Create.FactoryMethod;

/**
 * 定义工厂
 * @author : Woods
 * @ClassName : IFactory
 * @date : 2022/9/7  12:34 上午
 * @Version ：1.0
 */
public interface IFactory {
    /**
     * 定义创建产品的方法
     * @return
     */
    IProduct makeProduct();
}
