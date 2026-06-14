import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        int value = 1;

        for (int x=0; x<a; x++){
            for (int y=0; y<a; y++){
                if (value == 10)
                    value = 1;

                System.out.print(value++ +  " ");
            }
            System.out.println();
        }
    }
}