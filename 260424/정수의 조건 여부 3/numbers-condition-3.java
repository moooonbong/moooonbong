import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        if (input % 13 == 0 || input % 19 ==0)
            System.out.println("True");
        else 
            System.out.println("False");
    }
}