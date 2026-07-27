import java.util.*;

public class Main {
    static int[] month = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    static String[] day = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        int day1 = 0;
        int day2 = 0;

        for (int x=1; x<m1; x++){
            day1 += month[x];
        }
        day1 += d1;

        for (int x=1; x<m2; x++){
            day2 += month[x];
        }
        day2 += d2;

        int index = 1;

        int value = (day2 - day1) % 7;

        while(value != 0){
            if (value < 0){
                index--;
                if (index < 0){
                    index = 6;
                }
                value++;
            }
            else {
                index++;
                if(index > 6){
                    index = 0;
                }
                value--;
            }
        }

        System.out.println(day[index]);


    }
}