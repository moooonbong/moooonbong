import java.util.*;

public class Main {
    static void answer(int n){
        int first = n / 10;
        int second = n % 10;

        int sum = first + second;

        if (n % 2 == 0 && sum % 5 == 0){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        answer(n);

    }
}