import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        String a = sc.next();

            String[] arr = a.split(":");

            int value = Integer.parseInt(arr[0]);
            value++;
            arr[0] = String.valueOf(value);

            System.out.println(arr[0] + ":" + arr[1]);
        
    }
}