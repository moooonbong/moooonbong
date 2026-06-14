import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String input = sc.next();

        if (input.contains(".")){
            String[] arr = input.split("\\.");

            System.out.println(arr[1] + "-" + arr[2] + "-" + arr[0]);
        }
    }
}