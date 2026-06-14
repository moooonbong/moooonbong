import java.util.Scanner;

public class Main {
    static int gcp (int a, int b){
        if (a < b){
            int temp = a;
            a = b;
            b = temp;
        }
        if (b==0)
            return a;

        return gcp(b, a%b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int max = gcp(n, m);

        while (true){
            if (max % n == 0 && max % m == 0)
            {
                break;
            }
            max++;
        }

        System.out.println(max);

    }
}