package Structural.Decorator;

/**
 * 红外瞄准器
 *
 * @author : woods
 * @ClassName : InfraredSight
 * @date : 2022/10/18  2:19 PM
 * @Version ：1.0
 */
public class InfraredSight extends RifleDecorate {

    protected Rifle rifle;

    public InfraredSight(Rifle rifle) {
        super(rifle);
    }

    @Override
    public void equipmentLoading() {
        System.out.println("步枪已装备红外瞄准器！");
        super.equipmentLoading();
    }
}
