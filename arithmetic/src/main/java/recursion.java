/**
 * 递归
 *
 * @author : woods
 * @ClassName : recursion
 * @date : 2022/10/26  12:24 AM
 * @Version ：1.0
 */
public class recursion {
    public static void main(String[] args) {
        //求1-10的之和
        System.out.println(add(1));
    }

    private static int add(int num) {
        //明确终止条件
        if (num == 10) {
            return 10;
        } else {
            System.out.println(num);
            //提炼重复逻辑
            return num + add(num + 1);
        }

    }

}
