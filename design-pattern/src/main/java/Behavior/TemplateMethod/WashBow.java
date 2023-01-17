package Behavior.TemplateMethod;

/**
 * 洗碗任务
 *
 * @author : woods
 * @ClassName : WashBow
 * @date : 2023/1/17  3:52 PM
 * @Version ：1.0
 */
public class WashBow extends Template{

  int type = 3;


  @Override
  protected void doTask() {
    boolean needDOHomeWork = super.needDoHomeWork(this.type);
    if (needDOHomeWork) {
      System.out.println("需要做作业!");
      return;
    }
    System.out.println("洗碗不用管作业!开心的洗碗!");
  }
}
