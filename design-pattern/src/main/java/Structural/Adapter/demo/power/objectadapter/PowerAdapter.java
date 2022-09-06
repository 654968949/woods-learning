package Structural.Adapter.demo.power.objectadapter;

/**
 * 适配器接口内部持有原来的类实例, 然后在适配器类里面改变原来的方法逻辑 兼容适配
 */
public class PowerAdapter implements DC5 {
    //内部持有原来的类实例
    private AC220 ac220;

    public PowerAdapter(AC220 ac220) {
        this.ac220 = ac220;
    }

    public int output5V() {
        //改变原来的方法逻辑 兼容适配 把220v的电压转成5v
        int adapterInput = ac220.outputAC220V();
        int adapterOutput = adapterInput / 44;
        System.out.println("使用Adapter输入AC" + adapterInput + "V,输出DC" + adapterOutput + "V");
        return adapterOutput;
    }
}
