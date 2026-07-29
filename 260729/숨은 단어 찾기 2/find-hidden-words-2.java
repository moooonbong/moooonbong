import java.util.*;
import java.io.*;

public class Main {
    static int[] dx = {-1, 1, 0, 0, 1, -1, -1, 1};
    static int[] dy = {0, 0, -1, 1, -1 , 1, -1, 1};
    static char[][] map;
    static char[] bucket;
    static int count;
    static void func(int x, int y, int index, int depth){
        bucket[depth] = map[x][y];

        if (depth == 2){
            StringBuilder sb = new StringBuilder();

            for (int j=0; j<3; j++){
                sb.append(bucket[j]);
            }

            if (sb.toString().equals("LEE")){
                count++;
            }

            return;
        }

        int nx = x + dx[index];
        int ny = y + dy[index];

        if (nx < 0 || ny < 0 || nx >= map.length || ny >= map[0].length) return;

        func(nx, ny, index, depth+1);
    }
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        map = new char[n][m];
        bucket = new char[3];
        count = 0;

        for (int x=0; x<n; x++){
            st = new StringTokenizer(br.readLine());
            String a = st.nextToken();

            map[x] = a.toCharArray();
        }

        for (int x=0; x<n; x++){
            for (int y=0; y<m; y++){
                if (map[x][y] == 'L'){
                    for (int i = 0; i<8; i++){
                        func(x, y, i, 0);
                    }
                }
            }
        }

        System.out.println(count);
    }
}