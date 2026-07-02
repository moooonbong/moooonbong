import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        if (m == 1){
            System.out.println(n + n);
            return;
        }

        int answer = 0;

        int[][] arr = new int[n][n];

        for (int x=0; x<n; x++){
            for (int y=0; y<n; y++){
                arr[x][y] = sc.nextInt();
            }
        }


        for (int x=0; x<n; x++){
            int prev = 0;
            int count = 1;
            for (int y=0; y<n; y++){
                if (arr[x][y] == prev){
                    count++;
                    if (count >= m){
                        answer++;
                        break;
                    }
                }
                else {
                    prev = arr[x][y];
                    count = 1;
                }
            }
        }

        for (int x=0; x<n; x++){
            int prev = 0;
            int count = 1;
            for (int y=0; y<n; y++){
                if (arr[y][x] == prev){
                    count++;
                     if (count >= m){
                        answer++;
                        break;
                    }
                }
                else {
                    prev = arr[y][x];
                    count = 1;
                }
            }
        }
        System.out.println(answer);
    }
}