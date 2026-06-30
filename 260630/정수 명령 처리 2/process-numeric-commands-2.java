import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        List<Integer> queue = new ArrayList<>();

        for (int x=0; x<n; x++){
            String order = sc.next();

            if (order.equals("push")){
                int value = sc.nextInt();

                queue.add(value);
            }
            else if (order.equals("pop")){
                System.out.println(queue.get(0));
                queue.remove(0);
            }
            else if (order.equals("size")){
                System.out.println(queue.size());
            }
            else if (order.equals("empty")){
                System.out.println(queue.isEmpty() ? 1 : 0);
            }
            else {
                System.out.println(queue.get(0));
            }
        }
    }
}