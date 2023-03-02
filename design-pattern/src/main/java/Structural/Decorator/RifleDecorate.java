package Structural.Decorator;

/**
 * 步枪修饰类
 *
 * @author : woods
 * @ClassName : RifleDecorate
 * @date : 2022/10/18  2:07 PM
 * @Version ：1.0
 */
public abstract class RifleDecorate implements Rifle{
    private Rifle rifle;

    public RifleDecorate(Rifle rifle) {
        this.rifle = rifle;
    }

    @Override
    public void equipmentLoading() {
        rifle.equipmentLoading();
    }
}
