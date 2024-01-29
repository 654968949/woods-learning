package Structural.Decorator;

/**
 * 红外瞄准器
 *
 * @author : woods
 * @ClassName : InfraredSight
 * @date : 2022/10/18  2:19 PM
 * @Version ：1.0
 */
public class InfraredSight extends AbstractRifleDecorate {

    public InfraredSight(Rifle rifle) {
        super(rifle);
    }

    @Override
    public void operation() {
        System.out.println("步枪已装备红外瞄准器！");
        super.operation();
    }
}
