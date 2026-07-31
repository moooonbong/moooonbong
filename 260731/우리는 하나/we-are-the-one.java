import java.util.*;

public class Main {
    static int[][] map;
    static boolean[][] visited;
    static int u;
    static int d;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static List<Integer> list;
    static List<int[]> bucket;
    static int max;
    static int bfs(int x, int y){
        int count = 0;
        Queue<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[] {x, y});
        visited[x][y] = true;
        count++;

        while(!queue.isEmpty()){
            int[] now = queue.poll();

            int cx = now[0];
            int cy = now[1];

            for (int i=0; i<4; i++){
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                if (nx < 0 || ny < 0 || nx >= map.length || ny >= map[0].length) continue;
                if (visited[nx][ny]) continue;

                int value = Math.abs(map[cx][cy] - map[nx][ny]);
                if (value < u || value > d) continue;

                queue.offer(new int[] {nx, ny});
                visited[nx][ny] = true;
                count++;
            }
        }
        
        return count;
    }
    static void func(int k, int depth){
        if (depth == k){
            // for (int[] a : bucket){
            //     System.out.println("x = " + a[0] + " " + " y = " + a[1]);
            // }
            // System.out.println();
            int sum = 0;
            visited = new boolean[map.length][map.length];

            for (int[] a : bucket){
                int x = a[0];
                int y = a[1];
                
                if (visited[x][y]) continue;
                sum += bfs(x, y);   
            } 
            max = Math.max(max, sum);
            return;
        }

        int length = map.length;
        for (int x=depth; x<list.size(); x++){
            int xValue = x/length;
            int yValue = x%length;
            
            if (bucket.size() < depth + 1){
                bucket.add(new int[] {xValue, yValue});
            }
            else {
                bucket.set(depth, new int[] {xValue, yValue});
            }

            func(k, depth+1);
        }
    }

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        u = sc.nextInt();
        d = sc.nextInt();

        max = Integer.MIN_VALUE;

        map = new int[n][n];
        list = new ArrayList<>();
        bucket = new ArrayList<>();

        for (int x=0; x<n; x++){
            for (int y=0; y<n; y++){
                map[x][y] = sc.nextInt();
                list.add(map[x][y]);
            }
        }

        func(k, 0);

        System.out.println(max);
    }
}