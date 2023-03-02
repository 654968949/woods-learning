package Structural.Decorator.demo;

/**
 * @author : woods
 * @ClassName : ConcreteDecoratorA
 * @date : 2023/3/1  11:31 AM
 * @Version ：1.0
 */
public class ConcreteDecoratorA extends Decorator{
  public ConcreteDecoratorA(Component component) {
    super(component);
  }

  @Override
  public void operation() {
    System.out.println("ConcreteDecoratorA!!!!!");
    super.operation();
  }
}
