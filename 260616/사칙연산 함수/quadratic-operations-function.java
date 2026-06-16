import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char o = sc.next().charAt(0);
        int b = sc.nextInt();

        List<Character> list = new ArrayList<>(Arrays.asList('+', '-', '/' , '*'));

        if (!list.contains(o)){
            System.out.println("False");
        } else {
            if (o == '+'){
                System.out.println(a + " " + o + " " + b + " = " + (a+b));
            }
            else if (o == '-'){
                System.out.println(a + " " + o + " " + b + " = " + (a-b));
            }
            else if (o == '/'){
                System.out.println(a + " " + o + " " + b + " = " + (a/b));
            }
            else if (o == '*'){
                System.out.println(a + " " + o + " " + b + " = " + (a*b));
            }
        }
    }
}