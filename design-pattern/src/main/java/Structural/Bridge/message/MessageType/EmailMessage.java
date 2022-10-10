package Structural.Bridge.message.MessageType;

import Structural.Bridge.message.IMessage;

/**
 * @author : Woods
 * @ClassName : EmailMessage
 * @date : 2022/3/14  1:29 下午
 * @Version ：1.0
 */
public class EmailMessage implements IMessage {
    @Override
    public void sendMessage(String message, String toUser) {
        System.out.println("使用邮件消息发送:" + message);
    }
}
