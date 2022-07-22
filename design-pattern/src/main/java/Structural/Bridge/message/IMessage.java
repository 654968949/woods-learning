package Structural.Bridge.message;

/**
 * @author : Woods
 * @ClassName : IMessage
 * @date : 2022/3/14  1:27 下午
 * @Version ：1.0
 */
public interface IMessage {
    /**
     * 发消息
     * @param message 消息内容
     * @param toUser 接收人
     */
    void sendMessage(String message, String toUser);
}
