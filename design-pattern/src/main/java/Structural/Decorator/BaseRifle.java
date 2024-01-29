package Structural.Decorator;

/**
 * 步枪基础类， 最基本的功能定义在这
 * @author : woods
 * @ClassName : BaseRifle
 * @date : 2024/1/29  3:11 PM
 * @Version ：1.0
 */
public class BaseRifle extends Rifle {


    @Override
    protected void operation() {
        System.out.println("发射子弹");
    }
}
