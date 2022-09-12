package Create.FactoryMethod;

/**
 * @author : Woods
 * @ClassName : ProductA
 * @date : 2022/9/7  12:39 上午
 * @Version ：1.0
 */
public class ProductA implements IProduct {
    @Override
    public void doSomeThing() {
        System.out.println("产品 A");
    }
}
