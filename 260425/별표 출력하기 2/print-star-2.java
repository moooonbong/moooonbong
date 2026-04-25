import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        for (int x=0; x<input; x++){
            for (int y=input; y>x; y--)
                System.out.print("* ");
            System.out.println();
        }
    }
}