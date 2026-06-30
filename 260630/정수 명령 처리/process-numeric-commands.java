import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        List<Integer> stack = new ArrayList<>();

        for (int x=0; x<n; x++){
            String order = sc.next();

            if (order.equals("push")){
                int value = sc.nextInt();

                stack.add(value);
            }
            else if (order.equals("pop")){
                System.out.println(stack.get(stack.size()-1));
                stack.remove(stack.size()-1);
            }
            else if (order.equals("size")){
                System.out.println(stack.size());
            }
            else if (order.equals("empty")){
                System.out.println(stack.isEmpty() ? 1 : 0);
            }
            else if (order.equals("top")){
                System.out.println(stack.get(stack.size()-1));
            }
        }
    }
}