import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int enter = sc.nextInt();

        int[] arr = new int[enter];

        for (int x=0; x<enter; x++){
            arr[x] = sc.nextInt();
        }

        Arrays.sort(arr);

        for (int a : arr){
            System.out.print(a + " ");
        }
        System.out.println();

        Integer[] brr = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(brr, Collections.reverseOrder());

        for (int b : brr){
            System.out.print(b + " ");
        }
    }
}