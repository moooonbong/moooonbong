import java.util.Scanner;
public class Main {
    static boolean check(int a, int b, int c){
        int value = 10;

        while(a != 0 || b != 0 || c != 0){
            int carry = a % 10 + b % 10 + c % 10;
            if (carry >= 10){
                return false;
            }

            a /= 10;
            b /= 10;
            c /= 10;     
        }

        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = 0;

        for (int x=0; x<n-2; x++){
            for (int y=x+1; y<n-1; y++){
                for (int z=y+1; z<n; z++){
                    if (check(arr[x], arr[y], arr[z])){
                        max = Math.max(max, arr[x] + arr[y] + arr[z]);
                    }
                    else {
                        max = Math.max(max, -1);
                    }
                }
            }
        }

        if (max == 0){
            System.out.println(-1);
        }
        else {
            System.out.println(max);
        }
    }
}