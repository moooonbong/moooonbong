import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] value = new int[n];

        for (int x=0; x<n; x++){
            value[x] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int index = 0;
        int sum = 0;

        while(index < value.length){
            sum += value[index];
            index++;
            
            max = Math.max(sum, max);
            if (sum < 0){
                sum = 0;
            }
        }        

        System.out.println(max);
    }
}