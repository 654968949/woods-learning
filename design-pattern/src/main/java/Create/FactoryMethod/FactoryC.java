package Create.FactoryMethod;

/**
 * C产品工厂
 * @author : Woods
 * @ClassName : FactoryA
 * @date : 2022/9/7  12:37 上午
 * @Version ：1.0
 */
public class FactoryC implements IFactory {
    @Override
    public IProduct makeProduct() {
        return new ProductC();
    }
}
