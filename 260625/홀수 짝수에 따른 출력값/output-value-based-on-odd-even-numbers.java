import java.util.*;

public class Main {
    static boolean flag;
    static int func(int a, int sum){
        if (flag){
            if (a == 2)
                return sum + 2;
            if (a % 2 == 0){
                sum += a;
            }
        }
        else {
            if (a == 1)
                return sum + 1;
            if (a % 2 != 0){
                sum += a;
            }
        }

        return func(a-1, sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        flag = false;

        if (a % 2 == 0){
            flag = true;
        }

        System.out.println(func(a, 0));
    }
}