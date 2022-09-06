package Structural.Adapter.general.interfaceadapter;


/**
 * 接口适配器
 */
public abstract class Adapter implements Target {

    /**
     * 内部持有源方法类, 而不是继承
     */
    protected Adaptee adaptee;
    public Adapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }

    /*
        接口适配器, 只关注其中一种方法, 其他的空实现
     */
    public int request1() {
        return 0;
    }

    public int request2() {
        return 0;
    }

    public int request3() {
        return 0;
    }

    public int request4() {
        return 0;
    }
}
