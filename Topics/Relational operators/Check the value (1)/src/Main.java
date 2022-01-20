import java.lang.Integer;

public class Main {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = true;
        boolean c = false;
        boolean d = false;
        boolean result = c ^ b ^ a ^ d;
        System.out.println(result);
    }
}