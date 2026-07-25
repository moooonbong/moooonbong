import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n+1];
        int[] prefix = new int[n+1];

        for (int x=1; x<=n; x++){
            arr[x] = sc.nextInt();
        }

        for (int x=1; x<=n; x++){
            prefix[x] = arr[x] + prefix[x-1];
        }
    
        int max = 0;

        for (int x=k; x<=n; x++){
            max = Math.max(max, prefix[x]-prefix[x-k]);
        }
        System.out.println(max);
    }
}