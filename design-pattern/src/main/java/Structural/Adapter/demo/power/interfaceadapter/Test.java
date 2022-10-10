package Structural.Adapter.demo.power.interfaceadapter;


/**
 * 这个接口适配器其实就是适配了多个方法
 */
public class Test {
    public static void main(String[] args) {
        DC adapter = new PowerAdapter(new AC220());
        adapter.output5V();
        adapter.output12V();
        adapter.output24V();
        adapter.output36V();
    }
}
