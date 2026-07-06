import java.util.*;

public class Main {
    static int[] number;
    static int[] bucket;
    static void func(int n, int depth){
        if (n == depth){
            for (int a : bucket){
                System.out.print(a + " ");
            }
            System.out.println();
            return;
        }

        for (int x=0; x<number.length; x++){
            bucket[depth] = number[x];
            func(n, depth+1);
        }
    }
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int n = sc.nextInt();

        bucket = new int[n];
        number = new int[k];

        for (int x=0; x<k; x++){
            number[x] = x + 1;
        }

        func(n, 0);

    }
}