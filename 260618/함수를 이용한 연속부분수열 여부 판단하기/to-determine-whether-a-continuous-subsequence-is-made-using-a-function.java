import java.util.Scanner;
public class Main {
    static void check(int[] a, int[] b){
        if (a.length < b.length){
            System.out.println("No");
            return;
        }

        for (int x=0; x <= a.length - b.length; x++){
            int index = 0;
            boolean flag = true;

            for (int y=x; y<x+b.length; y++){
                if (a[y] != b[index++]){
                    flag = false;
                    break;
                }
            }
            if (flag){
                System.out.println("Yes");
                return;
            }
        }

        System.out.println("No");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] a = new int[n1];
        int[] b = new int[n2];
        for (int i = 0; i < n1; i++)
            a[i] = sc.nextInt();
        for (int i = 0; i < n2; i++)
            b[i] = sc.nextInt();
        // Please write your code here.
        check(a, b);
    }
}