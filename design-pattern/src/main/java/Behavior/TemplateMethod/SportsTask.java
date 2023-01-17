package Behavior.TemplateMethod;

/**
 * 运动任务
 *
 * @author : woods
 * @ClassName : SportsTask
 * @date : 2023/1/17  3:48 PM
 * @Version ：1.0
 */
public class SportsTask extends Template{
  int type = 1;


  @Override
  protected void doTask() {
    boolean needDOHomeWork = super.needDoHomeWork(this.type);
    if (needDOHomeWork) {
      System.out.println("需要做作业!");
      return;
    }
    System.out.println("开心的运动!");
  }
}
