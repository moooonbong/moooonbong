import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n+1];

        for (int x=1; x<=n; x++){
            arr[x] = sc.nextInt();
        }

        List<Integer> list  = new ArrayList<>();

        for (int x=1; x<=n; x++){
            list.add(arr[x]);
            if (x % 2 != 0){
                Collections.sort(list);
                System.out.print(list.get(x/2) + " ");
            }
        }

    }
}