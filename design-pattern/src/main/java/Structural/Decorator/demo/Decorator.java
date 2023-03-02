package Structural.Decorator.demo;

/**
 * 修饰类
 * @author : woods
 * @ClassName : Decorator
 * @date : 2023/3/1  11:27 AM
 * @Version ：1.0
 */
public abstract class Decorator implements Component {

  //持有一个引用
  protected Component component;

  public Decorator(Component component) {
    this.component = component;
  }
  @Override
  public void operation() {
    component.operation();
  }
}
