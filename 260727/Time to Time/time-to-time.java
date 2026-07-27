import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int minute1 = a * 60 + b;
        int minute2 = c * 60 + d;

        System.out.println(minute2 - minute1);
    }
}