import java.util.*;

public class Main {
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    static int bfs(int[] end){
        Queue<int[]>queue = new ArrayDeque<>();
        queue.offer(new int[] {0, 0, 0});
        visited[0][0] = true;
        
        while(!queue.isEmpty()){
            int[] now = queue.poll();

            int x = now[0];
            int y = now[1];
            int dis = now[2];

            if (x == end[0] && y == end[1]){
                return dis;
            }


            for (int i = 0; i<4; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];
                int nxDis = now[2] + 1;

                if (nx < 0 || ny < 0 || nx >= map.length || ny >= map[0].length) continue;
                if (visited[nx][ny]) continue;
                if (map[nx][ny] == 0) continue;

                queue.offer(new int[] {nx, ny, nxDis});
                visited[nx][ny] = true;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        // Please write your code here.
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

        int[] end = {n-1, m-1};

        System.out.println(bfs(end));
    }
}