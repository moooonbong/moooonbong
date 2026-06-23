import java.util.*;

public class Main {
    static void func1(int depth, int a){
        if (depth == a)
            return;

        System.out.print((depth+1) + " ");

        func1(depth+1, a);
    }

    static void func2(int a){
        if (a == 0)
            return;

        System.out.print(a-- + " ");
        func2(a);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        func1(0, a);
        System.out.println();
        func2(a);
    }
}