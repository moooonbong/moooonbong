import java.util.*;

public class Main {
    static class Temp {
        String code;
        String point;
        int time;

        Temp(String code, String point, int time){
            this.code = code;
            this.point = point;
            this.time = time;

            System.out.println("secret code : " + code);
            System.out.println("meeting point : " + point);
            System.out.println("time : " + time);
        }
    }
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String code = sc.next();
        String point = sc.next();
        int time = sc.nextInt();

        Temp temp = new Temp(code, point, time);
    }
}