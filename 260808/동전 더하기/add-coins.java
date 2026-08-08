import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] coin = new int[n];

        for (int x=0; x<n; x++){
            coin[x] = sc.nextInt();
        }

        Arrays.sort(coin);

        int index = coin.length-1;
        int count = 0;

        while(k != 0 && index >= 0){
            if (k >= coin[index]){
                k -= coin[index];
                count++;
            }
            else {
                index--;
            }
            
        }

        System.out.println(count);
    }
}