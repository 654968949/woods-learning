package Structural.Decorator;

/**
 * 装备夜视仪
 *
 * @author : woods
 * @ClassName : NightVisionGoggles
 * @date : 2022/10/18  2:18 PM
 * @Version ：1.0
 */
public class NightVisionGoggles extends RifleDecorate {

    protected Rifle rifle;
    public NightVisionGoggles(Rifle rifle) {
        super(rifle);
    }

    @Override
    public void equipmentLoading() {
        System.out.println("步枪已装备夜视仪！");
        super.equipmentLoading();
    }
}
