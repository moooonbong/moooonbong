import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String enter = sc.next();

        char[] arr = enter.toCharArray();

        Arrays.sort(arr);

        String word = new String(arr);

        System.out.println(word);
    }
}