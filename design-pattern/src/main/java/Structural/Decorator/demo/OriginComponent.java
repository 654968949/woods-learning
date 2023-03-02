package Structural.Decorator.demo;

/**
 * 原始对象
 * @author : woods
 * @ClassName : OriginComponent
 * @date : 2023/3/1  11:24 AM
 * @Version ：1.0
 */
public class OriginComponent implements Component {
  @Override
  public void operation() {
    System.out.println("原始对象");
  }
}
