package Structural.Decorator;

/**
 * 装备夜视仪
 *
 * @author : woods
 * @ClassName : NightVisionGoggles
 * @date : 2022/10/18  2:18 PM
 * @Version ：1.0
 */
public class NightVisionGoggles extends Rifle {
    @Override
    void equipmentLoading() {
        System.out.println("步枪已装备夜视仪！");
    }
}
