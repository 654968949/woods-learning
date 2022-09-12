package Create.FactoryMethod;

/**
 * @author : Woods
 * @ClassName : Client
 * @date : 2022/9/7  12:24 上午
 * @Version ：1.0
 */
public class Client {
    public static void main(String[] args) {
        /*
            简单工厂模式把生产对象的工厂也抽象了, 每种产品用不同的产品工厂,
            更符合单一职责原则
            缺点:
            FactoryA,FactoryB,FactoryC只能生产一种产品
         */
        //A工厂
        IFactory factory = new FactoryA();
        factory.makeProduct().doSomeThing();
        //切换到B工厂
        factory = new FactoryB();
        factory.makeProduct().doSomeThing();
        //切换到C工厂
        factory = new FactoryC();
        factory.makeProduct().doSomeThing();
    }
}
