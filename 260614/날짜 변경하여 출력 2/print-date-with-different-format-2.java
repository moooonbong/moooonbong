import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String day = sc.next();

        if (day.contains("-")){
            String[] arr = day.split("-");

            System.out.println(arr[2] + "." + arr[0] + "." + arr[1]);
        }
    }
}