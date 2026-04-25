import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        StringBuilder sb = new StringBuilder(input);
        sb.setCharAt(1, 'a');
        sb.setCharAt(sb.length()-2, 'a');

        System.out.println(sb.toString());


    }
}