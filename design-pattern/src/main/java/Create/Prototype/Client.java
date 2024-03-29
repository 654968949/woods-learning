package Create.Prototype;

/**
 * @author : Woods
 * @ClassName : Client
 * @date : 2022/9/12  12:57 上午
 * @Version ：1.0
 */
public class Client {
    public static void main(String[] args) {
        /*
            “原型模式（Prototype Pattern）指原型实例指定创建对象的种类，
            并且通过复制这些原型创建新的对象，属于创建型设计模式”
            “原型模式的核心在于复制原型对象。以系统中已存在的一个对象为原型，
            直接基于内存二进制流进行复制，不需要再经历耗时的对象初始化过程（不调用构造函数），
            性能提升许多。当对象的构建过程比较耗时时，可以把当前系统中已存在的对象作为原型，
            对其进行复制（一般是基于二进制流的复制），躲避初始化过程，使得新对象的创建时间大大缩短”

            “原型模式主要适用于以下应用场景。
            （1）创建对象成本较大（例如，初始化时间长，占用CPU太多，或者占用网络资源太多等），需要优化资源。
            （2）创建一个对象需要烦琐的数据准备或访问权限等，需要提高性能或者提高安全性。
            （3）系统中大量使用该类对象，且各个调用者都需要给它的属性重新赋值。
            在Spring中，原型模式应用得非常广泛，例如scope="prototype"、JSON.parseObject（），都是原型模式的具体应用。”

            原型模式的缺点
            （1）需要为每一个类都配置一个clone方法。
            （2）clone方法位于类的内部，当对已有类进行改造的时候，需要修改代码，违背了开闭原则。
            （3）当实现深克隆时，需要编写较为复杂的代码，而且当对象之间存在多重嵌套引用时，为了实现深克隆，每一层对象对应的类都必须支持深克隆，实现起来会比较麻烦。因此，深克隆、浅克隆需要运用得”
         */



    }
}
