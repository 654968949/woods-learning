package Behavior.Chain;

import cn.hutool.core.util.StrUtil;

/**
 * @author : Woods
 * @ClassName : ValidateHandler
 * @date : 2022/2/28  9:27 上午
 * @Version ：1.0
 */
public class ValidateHandler extends Handler {

    @Override
    public void doHandler(Member member) {
        if(StrUtil.isBlank(member.getLoginName()) || StrUtil.isEmpty(member.getloginPass())){
            System.out.println("用户名或密码为空");
            return;
        }
        System.out.println("用户名密码校验成功,可以往下执行");
        super.chainNext.doHandler(member);
    }
}
