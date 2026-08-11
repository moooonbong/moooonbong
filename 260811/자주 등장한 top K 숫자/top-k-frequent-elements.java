import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        Map<Integer, Integer> map = new HashMap<>();

        for (int x=0; x<n; x++){
            int value = sc.nextInt();

            map.put(value, map.getOrDefault(value, 0) + 1);
        }

        PriorityQueue<int[]> queue = new PriorityQueue<>((a, b) -> {
            if(a[1] == b[1]){
                return b[0] - a[0];
            }

            return b[1] - a[1];
        });

        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            queue.offer(new int[] {entry.getKey(), entry.getValue()});
        }

        while(k != 0){
            int[] now = queue.poll();

            System.out.print(now[0] + " ");
            k--;
        }
    }
}