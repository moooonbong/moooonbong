import java.util.*;

public class Main {
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int blockCount;
    static int count;
    static int max = Integer.MIN_VALUE;
    static boolean flag;
    static void dfs(int x, int y){
        visited[x][y] = true;
        blockCount++;

        if (blockCount >= 4 && !flag){
            count++;
            flag = true;
        }
        
        for (int i = 0; i<4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx < 0 || ny < 0 || nx >= map.length || ny >= map[0].length) continue;
            if (visited[nx][ny]) continue;
            if (map[x][y] != map[nx][ny]) continue;

            dfs(nx, ny);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();

        map = new int[n][n];
        visited = new boolean[n][n];

        
        count = 0;
        
        for (int x=0; x<n; x++){
            for (int y=0; y<n; y++){
                map[x][y] = sc.nextInt();
            }
        }

        for (int x=0; x<n; x++){
            for (int y=0; y<n; y++){
                if (visited[x][y]) continue;

                blockCount = 0;
                flag = false;

                dfs(x, y);
                max = Math.max(max, blockCount);
            }
        }

        System.out.println(count + " " + max);
    }
}