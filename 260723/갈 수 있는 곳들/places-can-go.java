import java.util.*;

public class Main {
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    static void bfs(int x, int y){
        Queue<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[] {x, y});
        visited[x][y] = true;

        while(!queue.isEmpty()){
            int[] now = queue.poll();

            int cx = now[0];
            int cy = now[1];

            for (int i = 0; i<4; i++){
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                if (nx < 0 || ny < 0 || nx >= map.length || ny >= map[0].length) continue;
                if (visited[nx][ny]) continue;
                if (map[nx][ny] == 1) continue;

                queue.offer(new int[] {nx, ny});
                visited[nx][ny] = true;
            }
        }
    }
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        map = new int[n][n];
        visited = new boolean[n][n];

        for (int x=0; x<n; x++){
            for (int y=0; y<n; y++){
                map[x][y] = sc.nextInt();
            }
        }

        for (int x=0; x<k; x++){
            int sx = sc.nextInt() - 1;
            int sy = sc.nextInt() - 1;

            if (map[sx][sy] == 1) continue;
            if (visited[sx][sy]) continue;

            bfs(sx, sy);
        }

        int count = 0;
        for (int x=0; x<n; x++){
            for (int y=0; y<n; y++){
                if (visited[x][y])
                    count++;
            }
        }
        System.out.println(count);
    }
}