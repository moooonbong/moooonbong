import java.util.*;

public class Main {
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static void bfs(int x, int y){
        visited[x][y] = true;

        Queue<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[] {x, y});

        while(!queue.isEmpty()){
            int[] now = queue.poll();
            int cx = now[0];
            int cy = now[1];

            if (cx == map.length-1 && cy == map[0].length-1){
                System.out.println("1");
                return;
            }

            for (int i=0; i<4; i++){
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                if (nx < 0 || ny < 0 || nx >= map.length || ny >= map[0].length) continue;
                if (visited[nx][ny]) continue;
                if (map[nx][ny] == 0) continue;

                queue.offer(new int[] {nx, ny});
                visited[nx][ny] = true;
            }
        }
        System.out.println("0");
    }
    public static void main(String[] args) {
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

        bfs(0, 0);

    }
}