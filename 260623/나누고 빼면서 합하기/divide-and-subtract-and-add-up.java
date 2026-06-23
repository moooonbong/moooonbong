import java.util.Scanner;
public class Main {
    static int func(int[] arr, int m){
        int sum = 0;
        while(m!=1){
            sum += arr[m];

            if (m % 2 != 0){
                m -= 1;
            } else {
                m /= 2;
            }
        }

        return sum + arr[m];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++)
            arr[i] = sc.nextInt();

        System.out.println(func(arr, m));
    }
}