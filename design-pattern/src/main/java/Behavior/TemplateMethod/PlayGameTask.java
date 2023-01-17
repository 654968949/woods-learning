package Behavior.TemplateMethod;

/**
 * 游戏任务
 *
 * @author : woods
 * @ClassName : PlayGameTask
 * @date : 2023/1/17  3:27 PM
 * @Version ：1.0
 */
public class PlayGameTask extends Template {
  int type = 0;



  @Override
  protected void doTask() {
    boolean needDOHomeWork = super.needDoHomeWork(this.type);
    if (needDOHomeWork) {
      System.out.println("需要做作业!");
      return;
    }
    System.out.println("开心的玩游戏!");
  }
}
