package Structural.Adapter.general.objectAdapter;

/**
 * Created by Tom.
 */
public class Test {
    public static void main(String[] args) {
        Target adapter = new PowerAdapter(new AC220());
        int result = adapter.request();
        System.out.println(result);
    }
}
