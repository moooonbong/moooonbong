import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        int[][] arr = new int[n][2];

        for (int x=0; x<n; x++){
            arr[x][0] = sc.nextInt();
            arr[x][1] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;
    
        // 건너뛸 좌표
        for (int x=1; x<n-1; x++){
            int cx = arr[0][0];
            int cy = arr[0][1];
            int skip = x;
            int dis = 0;
            for (int y=1; y<n; y++){
                if (x == y){
                    continue;
                }
                dis += (Math.abs(cx - arr[y][0]) + Math.abs(cy - arr[y][1]));

                cx = arr[y][0];
                cy = arr[y][1];

            }

            min = Math.min(dis, min);
        }

        System.out.println(min);
    }
}