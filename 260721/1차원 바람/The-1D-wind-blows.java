import java.util.*;
import java.io.*;

public class Main {
    static int[][] arr;
    static boolean[] visited;
    static int n;
    static int m;
    static void show(){
        for (int x=0; x<n; x++){
            for (int y=0; y<m; y++){
                System.out.print(arr[x][y] + " ");
            }
            System.out.println();
        }
        System.out.println();

    }
    static boolean upCheck(int index){
        int nextIndex = index -1;
        if (nextIndex < 0)
            return false;

        for (int x=0; x<m; x++){
            if (arr[index][x] == arr[nextIndex][x])
                return true;
        }
        return false;
    }
    static boolean downCheck(int index){
        int nextIndex = index + 1;
        if (nextIndex >= n)
            return false;

        for (int x=0; x<m; x++){
            if (arr[index][x] == arr[nextIndex][x])
                return true;
        }
        return false;
    }

    static void storm(int index, char direct){
        visited[index] = true;

        if (index < 0 || index > n)
            return;

        if (direct == 'R'){
            int temp = arr[index][0];

            for (int x=0; x<m-1; x++){
                arr[index][x] = arr[index][x+1];
            }
            arr[index][m-1] = temp;
        }
        else if (direct == 'L'){
            int temp = arr[index][m-1];

            for (int x=m-1; x>=1; x--){
                arr[index][x] = arr[index][x-1];
            }
            arr[index][0] = temp;
        }

        char nextDirect = (direct == 'L') ? 'R' : 'L';

        if (upCheck(index) && !visited[index-1])
            storm(index-1, nextDirect);
        if (downCheck(index) && !visited[index+1])
            storm(index+1, nextDirect);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());

        arr = new int[n][m];


        for (int x=0; x<n; x++){
            st = new StringTokenizer(br.readLine());
            for (int y=0; y<m; y++){
                arr[x][y] = Integer.parseInt(st.nextToken());
            }
        }

        for (int x=0; x<q; x++){
            st = new StringTokenizer(br.readLine());
            visited = new boolean[n];
            int floor = Integer.parseInt(st.nextToken());
            String direct = st.nextToken();

            storm(floor-1, direct.charAt(0));
        }

        for (int x=0; x<n; x++){
            for (int y=0; y<m; y++){
                System.out.print(arr[x][y] + " ");
            }
            System.out.println();
        }
    }
}