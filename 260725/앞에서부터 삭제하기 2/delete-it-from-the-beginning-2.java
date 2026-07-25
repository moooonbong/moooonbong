import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        // Please write your code here.
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        
        int sum = 0;
        double max = 0;

        sum += arr[n-1];
        queue.add(arr[n-1]);

        for (int k=n-2; k>=1; k--){
            sum += arr[k];
            queue.add(arr[k]);

            double avg = (double)(sum - queue.peek()) / (queue.size()-1);
            max = Math.max(max, avg);
        }
        System.out.printf("%.2f", max);
    }
}