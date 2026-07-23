import java.util.*;

class Main{
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int bfs(int x, int y, int value){
        Queue<int[]> queue = new ArrayDeque<>();

        queue.offer(new int[] {x, y});
        visited[x][y] = true;

        int max = Integer.MIN_VALUE;

        while(!queue.isEmpty()){
            int[] now = queue.poll();

            int cx = now[0];
            int cy = now[1];

            for (int i = 0; i<4; i++){
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                if (nx < 0 || ny < 0 || nx >= map.length || ny >= map[0].length) continue;
                if (visited[nx][ny]) continue;
                if (map[nx][ny] >= value) continue;

                queue.offer(new int[] {nx, ny});
                visited[nx][ny] = true;
                max = Math.max(max, map[nx][ny]);
            }
        }
        return max;
    }
    static int[] findPos(int maxValue){
        PriorityQueue<int[]> pos = new PriorityQueue<>((a, b) -> {
            if (a[0] != b[0])
                return Integer.compare(a[0], b[0]);

            return Integer.compare(a[1], b[1]);
        });

        for (int x=0; x<map.length; x++){
            for (int y=0; y<map[0].length; y++){
                if (map[x][y] == maxValue && visited[x][y]){
                    pos.offer(new int[] {x, y});
                }
            }
        }

        return pos.poll();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        map = new int[n][n];
        for (int x=0; x<n; x++){
            for (int y=0; y<n; y++){
                map[x][y] = sc.nextInt();
            }
        }

        int r = sc.nextInt()-1;
        int c = sc.nextInt()-1;

        for (int x=0; x<k; x++){
            visited = new boolean[n][n];

            int maxValue = bfs(r, c, map[r][c]);
            if (maxValue == Integer.MIN_VALUE) {
                System.out.println((r+1) + " " + (c+1));
                return;
            }
            int[] next = findPos(maxValue);
            r = next[0];
            c = next[1];
        }
        System.out.println((r+1) + " " + (c+1));
    }
}

