import java.util.Scanner;
public class Main {
    static int func(int result){
        if (result < 10)
            return result;

        return func(result / 10) + (result % 10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int result = a * b * c;

        System.out.println(func(result));
    }
}