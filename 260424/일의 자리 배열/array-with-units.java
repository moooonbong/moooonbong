import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();
        System.out.print(arr[0] + " " + arr[1] + " ");

        for (int x=2; x<arr.length; x++){
            arr[x] = (arr[x-1] + arr[x-2]) % 10;
            System.out.print(arr[x] + " ");
        }
    }
}