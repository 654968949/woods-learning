package Structural.Decorator;


import java.io.*;
import java.util.Arrays;

/**
 * @author : Woods
 * @ClassName : Client
 * @date : 2022/10/10  5:25 下午
 * @Version ：1.0
 */
public class Client {
    public static void main(String[] args) {
        /**
         * 装饰器模式在代码程序中适用于以下应用场景。
         * （1）用于扩展一个类的功能，或者给一个类添加附加职责。
         * （2）动态地给一个对象添加功能，这些功能可以再动态地被撤销。
         * （3）需要为一批平行的兄弟类进行改装或加装功能
         * 优点：装饰类和被装饰类可以独立发展，不会相互耦合，装饰模式是继承的一个替代模式，装饰模式可以动态扩展一个实现类的功能
         * 缺点：多层装饰会显得很复杂
         * 我其实一开始就在想，到底怎么样设计，才能给一个类动态的添加某些功能，并且完全不会影响到该类之前的功能，
         * 我想了一种：一个类的功能想要增加，就另写一个类B，在这个类B里面写功能，然后原来的类注入这个类B，那么原来的类功能就被扩展了
         * 想一个例子：多功能步枪 rifle，原始功能：射击步枪子弹
         * 扩展一：榴弹炮 howitzers
         * 扩展二：夜视仪 Night-vision goggles
         * 扩展三：红外瞄准器 Infrared sight
         */
        Rifle rifle = new RifleDecorate(new Howitzers());
        rifle.equipmentLoading();
        rifle = new RifleDecorate(new InfraredSight());
        rifle.equipmentLoading();
        rifle = new RifleDecorate(new NightVisionGoggles());
        rifle.equipmentLoading();
    }
}
