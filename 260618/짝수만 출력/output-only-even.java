import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int value = a;

        while(value >= a && value <= b){
            if (value % 2 == 0)
                System.out.print(value + " ");
            value++;
        }
    }
}