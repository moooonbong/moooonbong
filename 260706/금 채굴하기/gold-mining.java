import java.util.*;

public class Main {
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static int gold;
    static int[][] arr;
    static int[][] dist;
    static void dfs(int x, int y, int k, int depth){
        if (x >= arr.length || y >= arr[0].length || x < 0 || y < 0)
            return;

        if (k < depth){
            return;
        }

        if (dist[x][y] <= depth)
            return;

        if (arr[x][y] == 1 && dist[x][y] == Integer.MAX_VALUE)
            gold++;
        
        dist[x][y] = depth;  

        for (int i=0; i<4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];

            dfs(nx, ny, k, depth+1);
        }
    }
    static void init(){
        for (int x=0; x<dist.length; x++){
            Arrays.fill(dist[x], Integer.MAX_VALUE);
        }
    }
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        
        arr = new int[n][n];
        dist = new int[n][n];

        for (int x=0; x<n; x++){
            for (int y=0; y<n; y++){
                arr[x][y] = sc.nextInt();
            }
        }

        int answer = 0;

        for (int x=0; x<n; x++){
            for (int y=0; y<n; y++){
                for (int k = 0; k<= 2*n; k++){
                    int cost = (k * k) + (k + 1)*(k + 1);
                    dist = new int[n][n];
                    init();
                    gold = 0;

                    dfs(x, y, k, 0);

                    if (cost > gold * m)
                        continue;

                    answer = Math.max(answer, gold);
                }
            }
        }
        System.out.println(answer);
    }
}