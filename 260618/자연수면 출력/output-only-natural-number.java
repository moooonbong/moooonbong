import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > 0){
            for (int x=0; x<b; x++)
                System.out.print(a);
        } else
            System.out.println(0);
        
    }
}