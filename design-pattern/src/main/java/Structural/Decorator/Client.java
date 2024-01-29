package Structural.Decorator;


import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;

/**
 * @author : Woods
 * @ClassName : Client
 * @date : 2022/10/10  5:25 下午
 * @Version ：1.0
 */
public class Client {
    public static void main(String[] args) {
        /*
         * 装饰器模式在代码程序中适用于以下应用场景。
         * （1）用于扩展一个类的功能，或者给一个类添加附加职责。
         * （2）动态地给一个对象添加功能，这些功能可以再动态地被撤销。
         * （3）需要为一批平行的兄弟类进行改装或加装功能
         * 优点：装饰类和被装饰类可以独立发展，不会相互耦合，装饰模式是继承的一个替代模式，装饰模式可以动态扩展一个实现类的功能
         * 缺点：多层装饰会显得很复杂
         * 我其实一开始就在想，到底怎么样设计，才能给一个类动态的添加某些功能，并且完全不会影响到该类之前的功能
         * 想一个例子：多功能步枪 rifle，原始功能：射击步枪子弹
         * 扩展一：榴弹炮 howitzers
         * 扩展二：夜视仪 Night-vision goggles
         * 扩展三：红外瞄准器 Infrared sight
         * 装备了什么东西就有什么东西
         *
         * 如何做到对象嵌套对象的呢?
         * RifleDecorate类内部持有Rifle引用, 就会一级一级的嵌套了
         *
         */
        //步枪抽象类 BaseRifle基本的步枪
        //发射子弹的功能
        Rifle rifle = new BaseRifle();
        //榴弹炮
        rifle = new Howitzers(rifle);
        //红外瞄准
        rifle = new InfraredSight(rifle);
        //夜视仪
        rifle = new NightVisionGoggles(rifle);
        //功能准备完毕，可以触发
        rifle.operation();
    }
}
