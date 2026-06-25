import java.util.Scanner;
public class Main {

    static int func(int n, int count){
        if (n == 1){
            return count;
        }
        
        if (n % 2 == 0){
            n /= 2;
        }
        else {
            n = n * 3 + 1;
        }

        return func(n, count + 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(func(n, 0));
    }
}