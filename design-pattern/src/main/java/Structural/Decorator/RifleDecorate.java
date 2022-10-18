package Structural.Decorator;

/**
 * 步枪修饰类
 *
 * @author : woods
 * @ClassName : RifleDecorate
 * @date : 2022/10/18  2:07 PM
 * @Version ：1.0
 */
public class RifleDecorate extends Rifle{
    /**
     * 引入父类的引用，并当做构造方法的参数强制传入
     * 后面被修饰类传入的地方就是这个构造方法
     */
    private final Rifle rifle;

    public RifleDecorate(Rifle rifle) {
        this.rifle = rifle;
    }

    /**
     * 步枪发射
     */
    void emission(){
        rifle.equipmentLoading();
    }

    @Override
    void equipmentLoading() {
        //将请求转发给具体的实现
        rifle.equipmentLoading();
    }
}
