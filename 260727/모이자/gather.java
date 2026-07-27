import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] pos = new int[n];

        for (int x=0; x<n; x++){
            pos[x] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;

        for (int x=0; x<n; x++){
            int sum = 0;
            int target = x;
            for (int y=0; y<n; y++){
                sum += pos[y] * Math.abs(x - y);
            }
            min = Math.min(min, sum);
        }

        System.out.println(min);
    }
}