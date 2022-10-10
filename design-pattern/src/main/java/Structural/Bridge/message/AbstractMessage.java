package Structural.Bridge.message;

/**
 * @author : Woods
 * @ClassName : AbstractMessage
 * @date : 2022/3/14  1:33 下午
 * @Version ：1.0
 */
public abstract class AbstractMessage {
    /*
     * 桥接模式的这个桥梁就是通过这个IMessage接口实现桥两边事物的连接
     * 抽象类的不同实现代表一个维度
     * IMessage的不同实现代表一个维度
     * 就这样连接起来了
     */
    private IMessage message;

    public AbstractMessage(IMessage message) {
        this.message = message;
    }
    protected void sendMessage(String message, String toUser) {
        this.message.sendMessage(message,toUser);
    }
}
