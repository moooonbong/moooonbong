import java.util.Scanner;
public class Main {
    static void func(boolean flag, int n, int limit){
        if (n == limit+1){
            return;
        }

        if (n == 0){
            flag = true;
        } else {
            System.out.print(n + " ");
        }

        if (flag ){
            func(flag, n+1, limit);
        } else{
            func(flag, n-1, limit);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        func(false, n, n);
    }
}