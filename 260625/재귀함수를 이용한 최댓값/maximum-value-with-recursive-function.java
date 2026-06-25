import java.util.Scanner;
public class Main {
    static int func(int[] arr, int max, int index){
        if (index >= arr.length)
            return max;

        return func(arr, Math.max(arr[index], max), index+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(func(arr, Integer.MIN_VALUE, 0));
    }
}