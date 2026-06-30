import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        
        // Please write your code here.
        boolean sorted = true;
        do {
            sorted = true;

            for (int x=0; x<n-1; x++){
                if (arr[x] > arr[x+1]){
                    int temp = arr[x];
                    arr[x] = arr[x+1];
                    arr[x+1] = temp;

                    sorted = false;
                }
            }
        } while(sorted == false);

        for (int x=0; x<n; x++)
            System.out.print(arr[x] + " ");
    }
}