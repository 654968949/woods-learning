package Behavior.Chain;

/**
 * 责任链最开始的传入的参数
 * @author : Woods
 * @ClassName : Member
 * @date : 2022/2/27  9:49 下午
 * @Version ：1.0
 */
public class Member {
    private String loginName;
    private String loginPass;
    private String roleName;


    public Member(String loginName, String loginPass) {
        this.loginName = loginName;
        this.loginPass = loginPass;
    }

    public Member(String loginName, String loginPass, String roleName) {
        this.loginName = loginName;
        this.loginPass = loginPass;
        this.roleName = roleName;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getloginPass() {
        return loginPass;
    }

    public void setloginPass(String loginPass) {
        this.loginPass = loginPass;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
