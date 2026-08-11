import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        Map<String, Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();

        for (int x=0; x<n; x++){
            String word = sc.next();
            map.put(word, x + 1);
            list.add(word);
        }

        for (int x=0; x<m; x++){
            String enter = sc.next();   

            if (!map.containsKey(enter)){
                int index = Integer.parseInt(enter);

                System.out.println(list.get(index-1));
            }
            else {
                System.out.println(map.get(enter));
            }
        }
    }
}