package behavior.chain;

/**
 * @author : Woods
 * @ClassName : AuthHandler
 * @date : 2022/2/28  9:45 上午
 * @Version ：1.0
 */
public class AuthHandler extends Handler {
    @Override
    public void doHandler(Member member) {

        if(!"管理员".equals(member.getRoleName())){
            System.out.println("您不是管理员，没有操作权限");
            return;
        }
        System.out.println("您是管理员, 允许操作");
    }
}
