import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] bucket = new int[n];
        Map<Integer, Integer> map = new HashMap<>();

        for (int x=0; x<n; x++){
            bucket[x] = sc.nextInt();
        }

        int answer = 0;
        for (int x=0; x<n-1; x++){
            for (int y=x+1; y<n; y++){
                int sum = k - (bucket[x] + bucket[y]);
                
                if (map.containsKey(sum)){
                    answer += map.get(sum);
                }
            }

            map.put(bucket[x], map.getOrDefault(bucket[x], 0) + 1);
        }

        System.out.println(answer);
    }
}
