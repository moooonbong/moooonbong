import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int length = sc.nextInt();

        int[] arr = new int[length * 2];

        for (int x=0; x<length * 2; x++){
            arr[x] = sc.nextInt();
        }

        Arrays.sort(arr);

        int max = 0;

        int start = 0;
        int end = arr.length-1;

        while(start < end){
            int sum = arr[start] + arr[end];

            start++;
            end--;

            max = Math.max(sum, max);
        }

        System.out.println(max);
    }
}

// 1 2 3 5 7 8