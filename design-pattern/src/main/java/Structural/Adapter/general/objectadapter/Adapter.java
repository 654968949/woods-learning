package Structural.Adapter.general.objectadapter;

/**
 * Created by Tom.
 */
public class Adapter implements Target {
    /**
     * 内部持有源方法类, 在目标接口的实现方法里可以调用原来的方法, 加以适配即可
     */
    private Adaptee adaptee;
    public Adapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }
    public int request() {
        return adaptee.specificRequest() / 10;
    }
}
