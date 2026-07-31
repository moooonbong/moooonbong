import java.util.*;

public class Main {
    static boolean[][] visited;
    static int[] dx = {-2, -1, 1, 2, 2, 1, -1, -2};
    static int[] dy = {1, 2, 2, 1, -1, -2, -2, -1};
    static int bfs(int r1, int c1, int r2, int c2){
        Queue<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[] {r1, c1, 0});
        visited[r1][c1] = true;

        while(!queue.isEmpty()){
            int[] now = queue.poll();

            int x = now[0];
            int y = now[1];
            int dis = now[2];

            if (x == r2 && y == c2){
                return dis;
            }

            for (int i = 0; i<8; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];
                int nxDis = dis + 1;

                if (nx < 0 || ny < 0 || nx >= visited.length || ny >= visited[0].length) continue;
                if (visited[nx][ny]) continue;

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
        int r1 = sc.nextInt() - 1;
        int c1 = sc.nextInt() - 1;
        int r2 = sc.nextInt() - 1;
        int c2 = sc.nextInt() - 1;

        visited = new boolean[n][n];

        System.out.println(bfs(r1, c1, r2, c2));
    }
}