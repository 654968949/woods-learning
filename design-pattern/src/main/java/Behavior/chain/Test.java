package Behavior.chain;

/**
 * @author : Woods
 * @ClassName : Test
 * @date : 2022/2/27  10:18 下午
 * @Version ：1.0
 */
public class Test {
    public static void main(String[] args) {
        //MemberServiceImpl memberService =  new MemberServiceImpl();
        //memberService.login("","");

        Handler validateHandler = new ValidateHandler();
        Handler loginHandler = new LoginHandler();
        Handler authHandler = new AuthHandler();

        validateHandler.setNext(loginHandler);
        loginHandler.setNext(authHandler);
        //validateHandler.doHandler(new Member("管理员", "123"));

        Handler.Builder builder = new Handler.Builder();
        builder.addHandler(new ValidateHandler())
                .addHandler(new LoginHandler())
                .addHandler(new AuthHandler())
                .builder()
                .doHandler(new Member("管理员", "123") );

    }
}
