import java.util.Scanner;
public class Main {
    static int[] gl;
    static int func(int a1, int a2){
        int sum = 0;

        for (int x=a1-1; x<=a2-1; x++){
            sum += gl[x];
        }

        return sum;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        gl = arr;

        for (int i = 0; i < m; i++) {
            int a1 = sc.nextInt();
            int a2 = sc.nextInt();

            System.out.println(func(a1, a2));
        }
    }
}