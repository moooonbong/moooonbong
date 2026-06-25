import java.util.*;

public class Main {
    static int func(int a, int count){
        if (a == 1){
            return count;
        }

        if (a % 2 == 0){
            a /= 2;
        }
        else {
            a /= 3;
        }
        
        return func(a, count + 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        System.out.println(func(a, 0));
    }
}