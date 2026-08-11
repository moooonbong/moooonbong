import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int max = Integer.MIN_VALUE;

        Map<String, Integer> map = new HashMap<>();

        for (int x=0; x<n; x++){
            String value = sc.next();

            map.put(value, map.getOrDefault(value, 0) + 1);

            max = Math.max(max, map.get(value));
        }

        System.out.println(max);
    }
}