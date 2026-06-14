import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String a = sc.next();

        if (a.contains("-")){
            String[] number = a.split("-");

            System.out.println(number[0] + "-" + number[2] + "-" + number[1]);
        }
    }
}