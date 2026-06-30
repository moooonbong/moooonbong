import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        Deque<Integer> deque = new ArrayDeque<>();

        for (int x = 1; x<=n; x++){
            deque.offer(x);
        }

        while(deque.size() != 1){
            deque.pop();
            deque.offer(deque.pop());
        }

        System.out.println(deque.pop());
    }
}