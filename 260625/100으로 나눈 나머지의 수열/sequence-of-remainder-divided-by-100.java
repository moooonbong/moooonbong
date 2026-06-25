import java.util.*;

public class Main {
    static int func(int a){
        if (a == 1){
            return 2;
        }
        if (a == 2){
            return 4;
        }

        return (func(a-1) * func(a-2)) % 100;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        System.out.println(func(a));
    }
}