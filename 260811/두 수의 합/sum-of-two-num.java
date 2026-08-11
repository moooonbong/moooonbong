import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] bucket = new int[n];
        Map<Integer, Integer> map = new HashMap<>();

        for (int x=0; x<n; x++){
            bucket[x] = sc.nextInt();
        }

        int answer = 0;

        for (int x=0; x<n; x++){
            int value = k - bucket[x];

            if (map.containsKey(value)){
                answer += map.get(value);
            }

            if (!map.containsKey(bucket[x])){
                map.put(bucket[x], 1);
            }
            else {
                map.put(bucket[x], map.get(bucket[x]) + 1);
            }
        }

        System.out.println(answer);
    }
}