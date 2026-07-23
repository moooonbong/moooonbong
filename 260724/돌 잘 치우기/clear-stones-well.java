import java.util.*;
import java.io.*;

public class Main {
    static int[][] map;
    static int[][] visited;
    static int visitedNumber;
    static int[][] rock;
    static List<int[]> rockPos;
    static int[][] start;
    static int max;
    static int count;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static void find(){
        rockPos = new ArrayList<>();

        for (int x=0; x<map.length; x++){
            for (int y=0; y<map[0].length; y++){
                if (map[x][y] == 1){
                    rockPos.add(new int[] {x, y});
                }
            }
        }

        return;
    }
    static void adapt(){
        for (int[] r : rock){
            int x = r[0];
            int y = r[1];

            map[x][y] = 0;
        }
    }
    static void rollBack(){
        for (int[] r : rock){
            int x = r[0];
            int y = r[1];

            map[x][y] = 1;
        }
    }
    static void bfs(int x, int y){
        if (visited[x][y] == visitedNumber)
            return;

        Queue<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[] {x, y});
        visited[x][y] = visitedNumber;
        count++;

        while(!queue.isEmpty()){
            int[] now = queue.poll();

            int cx = now[0];
            int cy = now[1];

            for (int i = 0; i<4; i++){
                int nx = now[0] + dx[i];
                int ny = now[1] + dy[i];

                if (nx < 0 || ny < 0 || nx >= map.length || ny >= map[0].length) continue;
                if (visited[nx][ny] == visitedNumber) continue;
                if (map[nx][ny] == 1) continue;

                queue.offer(new int[] {nx, ny});
                if (visited[nx][ny] != visitedNumber) count++;
                visited[nx][ny] = visitedNumber;
            }
        }
    }
    static void chooseRock(int m, int depth){
        if (depth == m){
            adapt();

            visitedNumber++;
            count = 0;
        
            for (int x=0; x<start.length; x++){
                int sx = start[x][0] - 1;
                int sy = start[x][1] - 1;
                
                bfs(sx, sy);
            }
            rollBack();
    
            max = Math.max(max, count);
        
            return;
        }

        for (int x = depth; x<rockPos.size(); x++){
            rock[depth] = rockPos.get(x);

            chooseRock(m, depth+1);
        }
    }
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        max = Integer.MIN_VALUE;
        visitedNumber = 0;

        map = new int[n][n];
        rock = new int[m][2];
        start = new int[k][2];
        visited = new int[n][n];

        for (int x=0; x<n; x++){
            st = new StringTokenizer(br.readLine());
            for (int y=0; y<n; y++){
                map[x][y] = Integer.parseInt(st.nextToken());
            }
        }

        
        for (int x=0; x<k; x++){
            st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            
            start[x][0] = r;
            start[x][1] = c;
        }

        find();

        chooseRock(m, 0);

        System.out.println(max);
    }
}