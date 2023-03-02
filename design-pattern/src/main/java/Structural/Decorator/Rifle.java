package Structural.Decorator;

/**
 * 步枪抽象类
 * 修饰类继承它，并且将它引用到自己的类中，构造函数参数有抽象类
 * 被修饰类继承他，实现它的功能，可以放入修饰类的构造函数中去
 *
 * @author : woods
 * @ClassName : Rifle
 * @date : 2022/10/18  1:58 PM
 * @Version ：1.0
 */
public interface Rifle {

    /**
     * 装备装载方法
     */
     void equipmentLoading();
}
