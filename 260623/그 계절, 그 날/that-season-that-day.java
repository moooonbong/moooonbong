import java.util.Scanner;
import java.util.*;
public class Main {
    static void weather(List<Integer> list, int month, int date){
        int dateValue = list.get(month-1);

            if (dateValue >= date){
                 if (month >= 3 && month <= 5){
                    System.out.println("Spring");
                } else if (month >= 6 && month <= 8)
                    System.out.println("Summer");
                else if (month >= 9 && month <= 11)
                    System.out.println("Fall");
                else
                    System.out.println("Winter");
            }
            else 
                System.out.println("-1"); 
    }
    // 윤년인지 아닌지 확인
    static boolean check(int year){
        if (year % 4 == 0){
            if (year % 100 == 0 && year % 400 != 0)
                return false;
            else if (year % 100 == 0 && year % 400 == 0)
                return true;

            return true;
        }
        else{ 
            return false;
        }
    }
    static void func(int year, int month, int date){
        boolean isYear = check(year);

        if (isYear){
            List<Integer> list = new ArrayList<>(Arrays.asList(31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31));
            weather(list, month, date);
        }
        else {
            List<Integer> list = new ArrayList<>(Arrays.asList(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31));
            weather(list, month, date);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();

        func(y, m, d);
    }
}