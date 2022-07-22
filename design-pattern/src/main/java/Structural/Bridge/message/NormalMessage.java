package Structural.Bridge.message;

/**
 * @author : Woods
 * @ClassName : NormalMessage
 * @date : 2022/3/14  1:31 下午
 * @Version ：1.0
 */
public class NormalMessage extends AbstractMessage {
    public NormalMessage(IMessage message) {
        super(message);
    }

    void sendMessage(String message, String toUser) {
        super.sendMessage(message, toUser);
    }

}
