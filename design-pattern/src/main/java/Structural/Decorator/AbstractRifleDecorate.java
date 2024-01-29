package Structural.Decorator;

/**
 * 步枪修饰类
 *
 * @author : woods
 * @ClassName : RifleDecorate
 * @date : 2022/10/18  2:07 PM
 * @Version ：1.0
 */
public abstract class AbstractRifleDecorate extends Rifle{

    //静态代理，委派
    private Rifle rifle;

    //抽象类的构造方法
    public AbstractRifleDecorate(Rifle rifle) {
        this.rifle = rifle;
    }

    @Override
    public void operation() {
        rifle.operation();
    }
}
