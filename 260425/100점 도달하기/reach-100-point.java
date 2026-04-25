import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        for (int x=input; x<=100; x++){
            if (x >= 90)
                System.out.print("A ");
            else if (x >= 80)
                System.out.print("B ");
            else if (x >= 70)
                System.out.print("C ");
            else if (x >= 60)
                System.out.print("D ");
            else
                System.out.print("F ");
        }
    }
}