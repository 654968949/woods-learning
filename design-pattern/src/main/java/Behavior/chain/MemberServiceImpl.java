package Behavior.chain;

import cn.hutool.core.util.StrUtil;

/**
 * @author : Woods
 * @ClassName : MemberServiceImpl
 * @date : 2022/2/27  9:52 下午
 * @Version ：1.0
 */
public class MemberServiceImpl implements MemberService {

    @Override
    public void login(String loginName, String loginPass) {
        if(StrUtil.isBlank(loginName) || StrUtil.isEmpty(loginPass)){
            System.out.println("用户名或密码为空");
            return;
        }
        System.out.println("用户名和密码不为空，可以往下执行");

        Member member = checkExists(loginName,loginPass);
        if(null == member){
            System.out.println("用户不存在");
            return;
        }
        System.out.println("登录成功！");

        if(!"管理员".equals(member.getRoleName())){
            System.out.println("您不是管理员，没有操作权限");
            return;
        }
        System.out.println("允许操作");

    }

    private Member checkExists(String loginName,String loginPass){
        Member member = new Member(loginName,loginPass);
        member.setRoleName("管理员");
        return member;
    }


}
