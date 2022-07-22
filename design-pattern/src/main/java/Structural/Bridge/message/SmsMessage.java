package Structural.Bridge.message;

/**
 * 消息紧急程度的维度
 * @author : Woods
 * @ClassName : EmailMessage
 * @date : 2022/3/14  1:29 下午
 * @Version ：1.0
 */
public class SmsMessage implements IMessage {
    @Override
    public void sendMessage(String message, String toUser) {
        System.out.println("使用短信消息发送:" + message);
    }
}
