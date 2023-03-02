package Structural.Decorator;

/**
 * @author : woods
 * @ClassName : OriginRifle
 * @date : 2023/3/2  2:12 PM
 * @Version ：1.0
 */
public class OriginRifle implements Rifle{
  @Override
  public void equipmentLoading() {
    System.out.println("原始步枪!");
  }
}
