import java.util.*;

public class Main {
    static void func(int depth, int a){

        if(depth== a)
            return;

        for (int x=0; x<depth+1; x++){
            System.out.print("*");
        }
        System.out.println();

        func(depth+1, a);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        func(0, a);

    }
}