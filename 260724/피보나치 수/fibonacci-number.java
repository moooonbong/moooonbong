import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] memo = new int[n+1];

        memo[1] = 1;

        for (int x=2; x<=n; x++){
            memo[x] = memo[x-1] + memo[x-2];
        }
        System.out.println(memo[n]);
    }
}