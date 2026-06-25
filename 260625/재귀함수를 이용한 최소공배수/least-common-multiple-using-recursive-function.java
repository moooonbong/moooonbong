import java.util.Scanner;

public class Main {
    static int gcd(int a, int b){
        if (b == 0)
            return a;

        return gcd(b, a % b);
    }
    static int lcm(int a, int b){
        return (a * b) / gcd(a, b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        if (n == 1){
            System.out.println(arr[0]);
            return;
        }

        if (n == 2){
            System.out.println(lcm(arr[0], arr[1]));
            return;
        }

        int value = lcm(arr[0], arr[1]);

        for (int x=2; x<n; x++){
            value = lcm(value, arr[x]);
        }

        System.out.println(value);
    }
}