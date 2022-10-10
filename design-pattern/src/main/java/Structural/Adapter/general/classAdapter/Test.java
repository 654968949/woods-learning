package Structural.Adapter.general.classAdapter;


public class Test {
    public static void main(String[] args) {
        /*
            类适配器通过继承源方法类, 拥有源类的方法属性后, 并实现Target接口, 在实现的target接口方法里面做适配
         */
        Target adapter = new Adapter();
        int result = adapter.request();
        System.out.println(result);
    }
}
