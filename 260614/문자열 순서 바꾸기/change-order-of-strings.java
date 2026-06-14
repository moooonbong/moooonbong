import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        String temp = b;
        b = a;
        a = temp;

        System.out.println(a + "\n" + b);
    }
}