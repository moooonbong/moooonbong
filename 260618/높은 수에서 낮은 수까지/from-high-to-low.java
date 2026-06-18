import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int x=Math.max(a, b); x>=Math.min(a, b); x--){
            System.out.print(x + " ");
        }
    }
}