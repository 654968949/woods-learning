package Create.Builder;

/**
 * 建造者模式（Builder Pattern）将一个复杂对象的构建过程与它的表示分离，使得同样的构建过程可以创建不同的表示，属于创建型设计模式。
 *
 * @author : Woods
 * @ClassName : Client
 * @date : 2022/9/7  10:10 下午
 * @Version ：1.0
 */
public class Client {

    public static void main(String[] args) {
        Course course = new Course.Builder().addName("111")
                .addHomework("222")
                .addNote("333")
                .addPPt("444")
                .addVideo("5555").build();
        System.out.println(course);
    }
}
