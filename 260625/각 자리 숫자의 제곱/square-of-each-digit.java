import java.util.*;

public class Main {
    static int func(int a){
        if (a < 10)
        {
            return a*a;
        }

        return func(a/10) + (a%10)* (a%10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        System.out.println(func(a));
    }
}