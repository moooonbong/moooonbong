import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.io.*;

class Main{
    static int[][] map;

    static void show(){
        for (int [] m : map){
            for (int mm : m){
                System.out.print(mm + " ");
            }
            System.out.println();
        }
    }
    static List<int[]> findLocation(int r, int c, int[] m){
        int cx = r;
        int cy = c;
        List<int[]> location = new ArrayList<>();

        location.add(new int[] {r, c});

        for (int x=0; x<m.length; x++){
            int targetDis = m[x];
            int currentDis = 0;
            while(currentDis != targetDis){
                if (x == 0){
                    cx--;
                    cy++;
                }
                else if (x == 1){
                    cx--;
                    cy--;
                }
                else if (x == 2){
                    cx++;
                    cy--;
                }
                else {
                    cx++;
                    cy++;
                }
                currentDis++;
            }
            location.add(new int[]{cx, cy});
        }
        return location;
    }
    static void shakeClockWise(List<int[]> location){
        int first = 0;
        int second = 0;
        int third = 0;

        for (int x=0; x<location.size()-1; x++){
            int[] start = location.get(x);
            int[] end = location.get(x+1);

            int sx = start[0];
            int sy = start[1];
            int ex = end[0];
            int ey = end[1];

            if (x == 0){
                first = map[ex][ey];
                for (int i = ex, j = ey; i<sx && j>sy; i++, j--){
                    map[i][j] = map[i+1][j-1];
                }
            }
            else if (x == 1){
                second = map[ex][ey];
                for (int i = ex, j = ey;  i < sx && j < sy; i++, j++){
                    map[i][j] = map[i+1][j+1];
                }
                map[sx-1][sy-1] = first;
            }
            else if (x == 2){
                third = map[ex][ey];
                for (int i = ex, j = ey; i>sx && j < sy; i--, j++){
                    map[i][j] = map[i-1][j+1];
                }
                map[sx+1][sy-1] = second;
            }
            else {
                for (int i = ex, j = ey; i> sx && j> sy; i--, j--){
                    map[i][j] = map[i-1][j-1];
                }
                map[sx+1][sy+1] = third;
            }
        }
    }
    static void shakeAntiClockWise(List<int[]> location){
        int first = 0;

        for (int x=0; x<location.size()-1; x++){
            int[] end = location.get(x);
            int[] start = location.get(x+1);

            int sx = start[0];
            int sy = start[1];
            int ex = end[0];
            int ey = end[1];

            if (x == 0){
                first = map[ex][ey];
                for (int i = ex, j = ey; i>sx && j<sy; i--, j++){
                    map[i][j] = map[i-1][j+1];
                }
            }
            else if (x == 1){
                for (int i = ex, j = ey;  i > sx && j > sy; i--, j--){
                    map[i][j] = map[i-1][j-1];
                }
            }
            else if (x == 2){
                for (int i = ex, j = ey; i<sx && j > sy; i++, j--){
                    map[i][j] = map[i+1][j-1];
                }
            }
            else {
                for (int i = ex, j = ey; i < sx && j < sy; i++, j++){
                    map[i][j] = map[i+1][j+1];
                }
                map[sx-1][sy-1] = first;
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        map = new int[n][n];

        for (int x=0; x<n; x++){
            st = new StringTokenizer(br.readLine());
            for (int y=0; y<n; y++){
                map[x][y] = Integer.parseInt(st.nextToken());
            }
        }
        st = new StringTokenizer(br.readLine());

        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int[] m = new int[4];
        for (int x=0; x<4; x++)
            m[x] = Integer.parseInt(st.nextToken());

        int dir = Integer.parseInt(st.nextToken());

        List<int[]> locations = findLocation(r-1, c-1, m);

        if (dir == 0){
            shakeClockWise(locations);
        }
        else {
            shakeAntiClockWise(locations);
        }
        show();
    }
}
