import java.util.*;

public class Main {
    static void printt(int depth, int a){
        if (depth == a){
            return;
        }

        for (int x=depth; x<a; x++)
            System.out.print("* ");
        System.out.println();
        printt(depth+1, a);
        for (int x=depth; x<a; x++)
            System.out.print("* ");
        System.out.println();

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        printt(0, a);
    }
}