package Structural.Decorator;

/**
 * 步枪装备之榴弹炮
 *
 * @author : woods
 * @ClassName : Howitzers
 * @date : 2022/10/18  2:14 PM
 * @Version ：1.0
 */
public class Howitzers extends AbstractRifleDecorate {


    public Howitzers(Rifle rifle) {
        super(rifle);
    }

    @Override
    public void operation() {
        System.out.println("步枪已装备榴弹炮！");
        super.operation();
    }
}
