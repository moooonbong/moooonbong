import java.util.Scanner;

public class Main {
    static int[][][] blocks = {
        {{0, 0}, {0, 1}, {0, 2}},
        {{0, 0}, {1, 0}, {2, 0}},

        {{0, 0}, {0, 1}, {1, 0}},
        {{0, 0}, {0, 1}, {1, 1}},
        {{0, 0}, {1, 0}, {1, 1}},
        {{0, 1}, {1, 0}, {1, 1}}
    };
    static int[][] grid;
    static int n;
    static int m;

    static int getSum(int x, int y, int[][] block){
        int sum = 0;
        
        for (int i =0; i<3; i++){
            int nx = x + block[i][0];
            int ny = y + block[i][1];

            if (nx < 0 || ny < 0 || nx >= n || ny >= m)
                return -1;

            sum += grid[nx][ny];
        }

        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        grid = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        int answer = 0;
        // Please write your code here.
        for (int x=0; x<n; x++){
            for (int y=0; y<m; y++){
                for (int[][] block : blocks){
                    answer = Math.max(answer, getSum(x, y, block));
                }
            }
        }

        System.out.println(answer);
    }
}