import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int max = Integer.MIN_VALUE;

        int[] arr = new int[n];

        for (int x=0; x<n; x++){
            arr[x] = sc.nextInt();
        }

        for (int x=0; x<=n-k; x++){
            int sum = 0;
            for (int y=x; y<x+k; y++){
                sum += arr[y];
            }
            max = Math.max(max, sum);
        }

        System.out.println(max);
    }
}