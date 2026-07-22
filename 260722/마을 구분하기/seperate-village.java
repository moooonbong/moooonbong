import java.util.*;

class Main{
    static int[][] map;
    static boolean[][] visited;
    static List<Integer> town;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int dfs(int x, int y, int count){
        visited[x][y] = true;

        for (int i=0; i<4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx < 0 || ny < 0 || nx >= map.length || ny >= map[0].length) continue;
            if (visited[nx][ny]) continue;
            if (map[nx][ny] == 0) continue;

            count = dfs(nx, ny, count+1);
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        map = new int[n][n];
        visited = new boolean[n][n];
        town = new ArrayList<>();

        for (int x=0; x<n; x++){
            for (int y=0; y<n; y++){
                map[x][y] = sc.nextInt();
            }
        }

        for (int x=0; x<n; x++){
            for (int y=0; y<n; y++){
                if (map[x][y] == 0) continue;
                if (visited[x][y]) continue;

                town.add(dfs(x, y, 1));
            }
        }
        Collections.sort(town);
        System.out.println(town.size());
        for (int t : town){
            System.out.println(t);
        }
    }
}