import java.util.*;

class Main{
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {1, 0};
    static int[] dy = {0, 1};
    static boolean flag = false;
    static void dfs(int x, int y){
        visited[x][y] = true;

        if (x == map.length-1 && y == map[0].length-1){
            flag = true;
            return;
        }

        if (flag)
            return;

        for (int i=0; i<2; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx < 0 || ny < 0 || nx >= map.length || ny >= map[0].length) continue;
            if (visited[nx][ny]) continue;
            if (map[nx][ny] == 0) continue;

            dfs(nx, ny);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        map = new int[n][m];
        visited = new boolean[n][m];

        for (int x=0; x<n; x++){
            for (int y=0; y<m; y++){
                map[x][y] = sc.nextInt();
            }
        }

        dfs(0, 0);
        System.out.println(flag ? 1 : 0);
    }
}