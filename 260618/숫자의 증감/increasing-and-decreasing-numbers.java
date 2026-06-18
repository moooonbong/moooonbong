import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        int n = sc.nextInt();

        if (a.equals("A")){
            for (int x=1; x<=n; x++)
                System.out.print(x + " ");
        } else if (a.equals("D")){
            for (int x=n; x>=1; x--)
                System.out.print(x + " ");
        }
    }
}