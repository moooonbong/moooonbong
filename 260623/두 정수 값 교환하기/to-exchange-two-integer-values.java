import java.util.*;

public class Main {
    static void swap(int a, int b){
        int temp = b;
        b = a;
        a = temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        String temp = String.valueOf(b);

        String bt = String.valueOf(a);
        String at = temp;

        System.out.println(at + " " + bt);
    }
}