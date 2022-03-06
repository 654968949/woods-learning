package Structural.Adpter.demo.power.interfaceadapter;

/**
 * 接口适配器, 关注点和类适配器不一样, 接口适配器关注的是某一个需要适配的方法,
 * 把他适配了就行了, 方法就是创建接口实现类, 只实现我们需要的那个方法, 并在方法里做兼容适配
 */
public class PowerAdapter implements DC {
    private AC220 ac220;

    public PowerAdapter(AC220 ac220) {
        this.ac220 = ac220;
    }

    public int output5V() {
        int adapterInput = ac220.outputAC220V();
        int adapterOutput = adapterInput / 44;
        System.out.println("使用Adapter输入AC" + adapterInput + "V,输出DC" + adapterOutput + "V");
        return adapterOutput;
    }

    public int output12V() {
        return 0;
    }

    public int output24V() {
        return 0;
    }

    public int output36V() {
        return 0;
    }
}
