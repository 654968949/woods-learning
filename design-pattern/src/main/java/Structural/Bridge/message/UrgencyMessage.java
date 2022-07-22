package Structural.Bridge.message;

/**
 * @author : Woods
 * @ClassName : UrgencyMessage
 * @date : 2022/3/14  1:31 下午
 * @Version ：1.0
 */
public class UrgencyMessage extends AbstractMessage {
    public UrgencyMessage(IMessage message) {
        super(message);
    }

    void sendMessage(String message, String toUser) {
        message = "[加急]" + message;
        super.sendMessage(message, toUser);
    }
}
