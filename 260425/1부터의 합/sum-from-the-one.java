import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int input = sc.nextInt();

        for (int x=1; x<=100; x++){
            sum += x;

            if (sum >= input)
                {
                    System.out.println(x);
                    break;
                }
        }
    }
}