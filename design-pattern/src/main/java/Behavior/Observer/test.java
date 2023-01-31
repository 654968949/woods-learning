package Behavior.Observer;

import com.google.common.eventbus.EventBus;

/**
 * 观察者模式实现了类似于消息/广播的模式,使得观察者和被观察者解耦,
 * 被观察者的变化可以通知到感兴趣的观察者,从而做出响应
 *
 * @author : woods
 * @ClassName : test
 * @date : 2023/1/31  2:19 PM
 * @Version ：1.0
 */
public class test {
  public static void main(String[] args) {
    EventBus eventBus = new EventBus();
    //订阅
    eventBus.register(new GuavaEvent());
    //发布
    eventBus.post("tom");
  }
}
