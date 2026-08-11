import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        Map<Integer, Integer> map = new HashMap<>();

        for (int x=0; x<n; x++){
            int value = sc.nextInt();
            map.put(value, map.getOrDefault(value, 0) + 1);
        }
        for (int x=0; x<m; x++){
            int checkValue = sc.nextInt();

            if (!map.containsKey(checkValue))
                System.out.print(0 + " ");
            else {
                System.out.print(map.get(checkValue) + " ");
            }
        }

    }
}