package Structural.Decorator.demo;

import org.checkerframework.checker.units.qual.C;

import java.io.FileInputStream;
import java.util.Collections;

/**
 * @author : woods
 * @ClassName : Client
 * @date : 2023/3/1  11:37 AM
 * @Version ：1.0
 */
public class Client {
  public static void main(String[] args) {
    Component component = new OriginComponent();
    //将原始对象OriginComponent放入ConcreteDecoratorA  ConcreteDecoratorA对象里面就有一个OriginComponent
    component = new ConcreteDecoratorA(component);
    //ConcreteDecoratorA放入ConcreteDecoratorB  ConcreteDecoratorB对象里面就有一个ConcreteDecoratorA
    component = new ConcreteDecoratorB(component);
    //所以按照ConcreteDecoratorB -> ConcreteDecoratorA -> 原始对象执行operation()方法
    component.operation();
  }
}
