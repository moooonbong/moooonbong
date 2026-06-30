import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        List<Integer> deque = new ArrayList<>();

        for (int x=0; x<n; x++){
            String order = sc.next();

            if (order.equals("push_front")){
                int value = sc.nextInt();

                if (deque.isEmpty()){
                    deque.add(value);
                } else {
                    deque.add(0, value);
                }
            }
            else if (order.equals("push_back")){
                int value = sc.nextInt();

                deque.add(value);
            }
            else if (order.equals("pop_front")){
                System.out.println(deque.get(0));
                deque.remove(0);
            }
            else if (order.equals("pop_back")){
                System.out.println(deque.get(deque.size()-1));
                deque.remove(deque.size()-1);
            }
            else if (order.equals("size")){
                System.out.println(deque.size());
            }
            else if (order.equals("empty")){
                System.out.println(deque.isEmpty()? 1 : 0);
            }
            else if (order.equals("front")){
                System.out.println(deque.get(0));
            }
            else if (order.equals("back")){
                System.out.println(deque.get(deque.size()-1));
            }
        }
    }
}