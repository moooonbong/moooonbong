import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        if ((input % 2 != 0 && input % 3 == 0) || (input % 2 == 0 && input % 5 == 0))
            System.out.println(true);
        else 
            System.out.println(false);
    }
}