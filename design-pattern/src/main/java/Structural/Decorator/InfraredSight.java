package Structural.Decorator;

/**
 * 红外瞄准器
 *
 * @author : woods
 * @ClassName : InfraredSight
 * @date : 2022/10/18  2:19 PM
 * @Version ：1.0
 */
public class InfraredSight extends Rifle {
    @Override
    void equipmentLoading() {
        System.out.println("步枪已装备红外瞄准器！");
    }
}
