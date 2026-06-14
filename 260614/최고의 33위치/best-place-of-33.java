import java.util.Scanner;
public class Main {
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};

    static int bfs(int sx, int sy, int[][] grid){
        int count = 0;
        for (int x=sx; x<=sx+2; x++){
            for (int y=sy; y<=sy+2; y++){
                if (grid[x][y]==1)
                    count++;
            }
        }
        
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] grid = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        // Please write your code here.
        int max = Integer.MIN_VALUE;

        for (int x=0; x<n-2; x++){
            for (int y=0; y<n-2; y++){
                max = Math.max(max, bfs(x, y, grid));
            }
        }

        System.out.println(max);
    }
}