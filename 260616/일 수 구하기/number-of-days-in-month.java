import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.println(month[a-1]);


    }
}