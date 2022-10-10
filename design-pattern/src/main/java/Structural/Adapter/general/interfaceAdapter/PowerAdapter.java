package Structural.Adapter.general.interfaceAdapter;


/**
 * 接口适配器
 */
public class PowerAdapter implements DC {

    /**
     * 内部持有源方法类, 而不是通过继承直接子类重新实现方法
     */
    protected AC220 ac220;

    public PowerAdapter(AC220 ac220){
        this.ac220 = ac220;
    }

    @Override
    public int output5V() {
        return ac220.outputAC220V() / 44;
    }

    @Override
    public int output12V() {
        return 0;
    }

    @Override
    public int output24V() {
        return 0;
    }

    @Override
    public int output36V() {
        return 0;
    }
}
