import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String word = sc.next();

        Deque<Character> stack = new ArrayDeque<>();

        for (int x=0; x<word.length(); x++){
            char target = word.charAt(x);

            if (target == '('){
                stack.push(target);
            }
            else {
                if (stack.isEmpty()){
                    System.out.println("No");
                    return;
                }
                stack.pop();
            }
        }

        if (stack.isEmpty()){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}