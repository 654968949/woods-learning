package Behavior.chain;

/**
 * @author : Woods
 * @ClassName : LoginHandler
 * @date : 2022/2/28  9:42 上午
 * @Version ：1.0
 */
public class LoginHandler extends Handler {
    @Override
    public void doHandler(Member member) {
        Member newMember = checkExists(member.getLoginName(), member.getloginPass());
        if(null == newMember){
            System.out.println("用户不存在");
            return;
        }
        System.out.println("登录成功！");
        chain.doHandler(member);
    }

    private Member checkExists(String loginName,String loginPass){
        Member member = new Member(loginName,loginPass);
        member.setRoleName("管理员");
        return member;
    }
}
