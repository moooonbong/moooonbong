import java.util.Scanner;

public class Main {
    static int func(int n, int result){
        if (n == 1){
            return result;
        }

        result *= n;
        
        return func(n-1, result);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(func(n, 1));
    }
}