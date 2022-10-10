package Structural.Adapter.general.classAdapter;

/**
 * 类适配器 继承源方法类,拥有源类的方法属性, 并实现Target接口, 在实现的target接口方法里面做适配
 */
public class Adapter extends Adaptee implements Target {
    public int request() {
        return super.specificRequest() / 10;
    }
}
