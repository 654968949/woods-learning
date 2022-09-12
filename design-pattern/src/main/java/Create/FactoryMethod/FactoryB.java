package Create.FactoryMethod;

/**
 * B产品工厂
 * @author : Woods
 * @ClassName : FactoryA
 * @date : 2022/9/7  12:37 上午
 * @Version ：1.0
 */
public class FactoryB implements IFactory {
    @Override
    public IProduct makeProduct() {
        return new ProductB();
    }
}
