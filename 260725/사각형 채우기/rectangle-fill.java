import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] sol = new int[n+1];

        sol[1] = 1;

        if (n == 1){
            System.out.println(sol[1]);
            return;
        }
        sol[2] = 2;
        
        if (n == 2){
            System.out.println(sol[2]);
            return;
        }
       
        for (int x=3; x<=n; x++){
            sol[x] = (sol[x-1] + sol[x-2]) % 10007;
        }
        System.out.println(sol[n]);
    }
}

// n = 1 1
// n = 2 2
// n = 3 3
// n = 4 5