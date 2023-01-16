package Behavior.Chain;

/**
 * @author : Woods
 * @ClassName : Test
 * @date : 2022/2/27  10:18 下午
 * @Version ：1.0
 */
public class Test {
    public static void main(String[] args) {

        Handler.Builder builder = new Handler.Builder();
        builder.addHandler(new ValidateHandler())
                .addHandler(new LoginHandler())
                .addHandler(new AuthHandler())
                .builder()
                .doHandler(new Member("woods", "123", "管理员1"));
    }
}
