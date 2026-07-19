import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        String t = sc.next();

        List<String> list = new ArrayList<>();

        for (int x=0; x<n; x++){
            String enter = sc.next();

            if (enter.startsWith(t)){
                list.add(enter);
            }
        }

        Collections.sort(list);

        System.out.println(list.get(k-1));


    }
}