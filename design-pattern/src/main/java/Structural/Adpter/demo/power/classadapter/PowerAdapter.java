package Structural.Adpter.demo.power.classadapter;

/**
 * 类适配器既继承了原有的类也实现了新增的接口中的方法, 就这样适配了新增的功能
 */
public class PowerAdapter extends AC220 implements DC5 {
    public int output5V() {
        //super调用原来父类的方法
        //int adapterInput = super.outputAC220V();
        int adapterInput = output5V();
        int adapterOutput = adapterInput / 44;
        System.out.println("使用Adapter输入AC" + adapterInput + "V,输出DC" + adapterOutput + "V");
        return adapterOutput;
    }
}
