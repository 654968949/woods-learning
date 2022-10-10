package Structural.Bridge.message;

import Structural.Bridge.message.MessageType.EmailMessage;
import Structural.Bridge.message.MessageType.SmsMessage;
import Structural.Bridge.message.UrgencyLevel.NormalMessage;
import Structural.Bridge.message.UrgencyLevel.UrgencyMessage;

/**
 * @author : Woods
 * @ClassName : test
 * @date : 2022/3/14  1:45 下午
 * @Version ：1.0
 */
public class test {
    public static void main(String[] args) {
        IMessage message = new EmailMessage();
        AbstractMessage abstractMessage = new NormalMessage(message);
        abstractMessage.sendMessage("加班", "王总");

        message = new SmsMessage();
        abstractMessage = new UrgencyMessage(message);
        abstractMessage.sendMessage("加班", "王总");

    }
}
