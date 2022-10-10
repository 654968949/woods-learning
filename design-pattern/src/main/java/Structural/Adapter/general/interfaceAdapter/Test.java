package Structural.Adapter.general.interfaceAdapter;


/**
 * Created by Tom.
 */
public class Test {
    public static void main(String[] args) {
        /*
            接口适配器, 抽象实现类或者接口实现类内部持有需要被适配的类实例引用
            在实现的接口方法里面适配原方法
         */
        DC dc = new PowerAdapter(new AC220());

        System.out.println(dc.output5V());
    }
}
