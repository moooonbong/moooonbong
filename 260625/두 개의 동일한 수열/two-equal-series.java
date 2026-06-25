import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int enter = sc.nextInt();

        int[] arr = new int[enter];
        int[] brr = new int[enter];

        for (int x=0; x<enter; x++){
            arr[x] = sc.nextInt();
        }

        for (int x=0; x<enter; x++){
            brr[x] = sc.nextInt();
        }

        Arrays.sort(arr);
        Arrays.sort(brr);

        boolean flag = false;

        for (int x = 0; x<enter; x++){
            if (arr[x] != brr[x]){
                flag = true;
                System.out.println("No");
                break;
            }
        }

        if (!flag)
            System.out.println("Yes");
        
    }
}