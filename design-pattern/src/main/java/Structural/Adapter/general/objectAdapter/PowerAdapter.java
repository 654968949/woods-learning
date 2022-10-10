package Structural.Adapter.general.objectAdapter;

/**
 * Created by Tom.
 */
public class PowerAdapter implements Target {
    /**
     * 内部持有源方法类, 在目标接口的实现方法里可以调用原来的方法, 加以适配即可
     */
    private AC220 ac220;
    public PowerAdapter(AC220 ac220){
        this.ac220 = ac220;
    }

    @Override
    public int request() {
        return ac220.specificRequest() / 10;
    }
}
