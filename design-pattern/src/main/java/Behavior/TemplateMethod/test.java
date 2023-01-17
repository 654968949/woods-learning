package Behavior.TemplateMethod;

/**
 * test
 *
 * @author : woods
 * @ClassName : test
 * @date : 2023/1/17  2:56 PM
 * @Version ：1.0
 */
public class test {
  public static void main(String[] args) {
    Template playGameTask = new PlayGameTask();
    Template sportsTask = new SportsTask();
    Template washBow = new WashBow();

    playGameTask.doTask();
    sportsTask.doTask();
    washBow.doTask();

  }
}
