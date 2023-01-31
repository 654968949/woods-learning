package Behavior.Observer;

import com.google.common.eventbus.Subscribe;

/**
 *
 *
 * @author : woods
 * @ClassName : GuavaEvent
 * @date : 2023/1/31  2:27 PM
 * @Version ：1.0
 */
public class GuavaEvent {

  @Subscribe
  public void subscribe(String str) {
    System.out.println(str);
  }
}
