import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int[] month = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        int month1 = 0;

        for (int x=0; x<m1; x++){
            month1 += month[x];
        }   
        month1 += d1;

        int month2 = 0;
        for (int x=0; x<m2; x++){
            month2 += month[x];
        }
        month2 += d2;

        System.out.println(month2 - month1 + 1);

    }
}