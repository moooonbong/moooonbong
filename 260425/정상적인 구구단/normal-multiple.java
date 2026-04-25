import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        for (int x=1; x<=input; x++){
            for (int y=1; y<=input; y++){
                System.out.print(x + " * " + y + " = " + (x*y));
            }
            System.out.println();
        }
    }
}