import java.util.*;
public class Main {
    public static void main(String[] args) {
        String[] arr = new String[10];

        Scanner sc = new Scanner(System.in);

        for (int x=0; x<arr.length; x++){
            arr[x] = sc.next();
        }

        for (int x=arr.length-1; x>=0; x--)
            System.out.print(arr[x]);
    }
}