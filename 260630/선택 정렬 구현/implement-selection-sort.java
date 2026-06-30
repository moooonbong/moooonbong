import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.

        for (int x=0; x<n-1; x++){
            int min = x;

            for (int y=x+1; y<n; y++){
                if (arr[y] < arr[min]){
                    min = y;
                }
            }
            int temp = arr[x];
            arr[x] = arr[min];
            arr[min] = temp;
        }

        for (int x=0; x<n; x++)
            System.out.print(arr[x] + " ");
    }
}