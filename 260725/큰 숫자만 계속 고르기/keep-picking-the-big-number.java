import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        PriorityQueue<Integer> queue = new PriorityQueue<>((a, b)-> b - a);

        for (int x=0; x<n; x++){
            queue.add(sc.nextInt());
        }

        for (int x=0; x<m; x++){
            int value = queue.poll();
            queue.add(value-1);
        }

        System.out.println(queue.poll());
    }
}