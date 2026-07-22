import java.util.*;

class Main{
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static void dfs(int x, int y, int k){
        visited[x][y] = true;

        for (int i = 0; i<4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx < 0 || ny < 0 || nx >= map.length || ny >= map[0].length) continue;
            if (visited[nx][ny]) continue;
            if (map[nx][ny] <= k) continue;

            dfs(nx, ny, k);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        map = new int[n][m];
        int maxValue = 0;
        for (int x=0; x<n; x++){
            for (int y=0; y<m; y++){
                map[x][y] = sc.nextInt();
                maxValue = Math.max(map[x][y], maxValue);
            }
        }

        int max = 0;
        int[] area = new int[maxValue+1];

        for (int k = 1; k<=maxValue; k++){
            int count = 0;
            visited = new boolean[n][m];
            for (int x=0; x<n; x++){
                for (int y=0; y<m; y++){
                    if(map[x][y] <= k) continue;
                    if (visited[x][y]) continue;

                    dfs(x, y, k);
                    count++;
                }
            }
            max = Math.max(count, max);
            area[k] = count;
        }
       
            for (int x=1; x<=maxValue; x++){
                if (max == area[x]){
                    System.out.print(x + " ");
                    break;
                }
            }
        
       
        System.out.println(max);
    }
}