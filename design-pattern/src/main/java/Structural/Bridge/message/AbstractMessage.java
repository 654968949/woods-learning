package Structural.Bridge.message;

/**
 * @author : Woods
 * @ClassName : AbstractMessage
 * @date : 2022/3/14  1:33 下午
 * @Version ：1.0
 */
public class AbstractMessage {
    //消息类型的维度
    private IMessage message;

    public AbstractMessage(IMessage message) {
        this.message = message;
    }
    void sendMessage(String message, String toUser) {
        this.message.sendMessage(message,toUser);
    }
}
