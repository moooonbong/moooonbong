import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] grid = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();
        int r = sc.nextInt()-1;
        int c = sc.nextInt()-1;

        // Please write your code here.
        int value = grid[r][c];
        grid[r][c] = 0;

        int[] dx = {0, 0, 1, -1};
        int[] dy = {1, -1, 0, 0};

        for (int i=0; i<4; i++){
            int cx = r;
            int cy = c;

            for (int x=0; x<value-1; x++){
                cx = dx[i] + cx;
                cy = dy[i] + cy;

                if (cx < 0 || cy < 0 || cx >= n || cy >= n) continue;

                grid[cx][cy] = 0;
            }
        }

        int[][] temp = new int[n][n];
        int sx = n-1;
        int sy = 0;

        for (int y=0; y<n; y++){
            for (int x=n-1; x>=0; x--){
                if (grid[x][y]!= 0){
                    temp[sx][sy] = grid[x][y];
                    sx--;
                }
            }
            sy++;
            sx = n-1;
        }
        

        for (int x=0; x<n; x++){
            for (int y=0; y<n; y++){
                System.out.print(temp[x][y] + " ");
            }
            System.out.println();
        }
        
    }
}