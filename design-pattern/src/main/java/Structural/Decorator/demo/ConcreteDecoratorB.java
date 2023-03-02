package Structural.Decorator.demo;

/**
 * @author : woods
 * @ClassName : ConcreteDecoratorA
 * @date : 2023/3/1  11:31 AM
 * @Version ：1.0
 */
public class ConcreteDecoratorB extends Decorator{
  public ConcreteDecoratorB(Component component) {
    super(component);
  }

  @Override
  public void operation() {
    System.out.println("ConcreteDecoratorB!!!!!");
    super.operation();
  }
}
