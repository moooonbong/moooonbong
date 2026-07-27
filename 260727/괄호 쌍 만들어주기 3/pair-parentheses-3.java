import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String word = sc.next();

        int answer = 0;
        char target = ' ';
        for (int x=0; x<word.length(); x++){
            if (word.charAt(x) == '('){
                target = word.charAt(x);
                for (int y=x+1; y<word.length(); y++){
                    if (word.charAt(y) == ')'){
                        answer++;
                    }
                }
            }
        }

        System.out.println(answer);
    }
}