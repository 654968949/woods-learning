package Behavior.Chain;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Woods
 * @ClassName : Test
 * @date : 2022/2/27  10:18 下午
 * @Version ：1.0
 */
public class Test {
    public static void main(String[] args) {

      new Handler.Builder()
          .addHandler(new ValidateHandler())
          .addHandler(new LoginHandler())
          .addHandler(new AuthHandler())
          .getChainHead()
          //从链头开始执行校验
          .doHandler(new Member("woods", "123", "管理员"));
    }
}
