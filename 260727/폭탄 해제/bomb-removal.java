import java.util.*;

public class Main {
    static class Code{
        String code;
        String color;
        int second;

        Code(String code, String color, int second){
            this.code = code;
            this.color = color;
            this.second = second;
            System.out.println("code : " + code);
            System.out.println("color : " + color);
            System.out.println("second : " + second);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String code = sc.next();
        String color = sc.next();
        int second = sc.nextInt();

        Code code1 = new Code(code, color, second);
    }
}