package Structural.Bridge.message;

/**
 * @author : Woods
 * @ClassName : AbstractMessage2
 * @date : 2022/3/14  2:13 下午
 * @Version ：1.0
 */
public abstract class AbstractMessage2 {
    protected IMessage message;

    public AbstractMessage2(IMessage message) {
        this.message = message;
    }
    void sendMessage(String message, String toUser) {
        this.message.sendMessage(message,toUser);
    }
}
