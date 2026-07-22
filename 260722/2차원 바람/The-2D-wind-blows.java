import java.util.*;

public class Main {
    static int[][] map;
    static int[][] answer;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    static int[][] init(){
        int n = map.length;
        int m = map[0].length;
        int[][] answer = new int[n][m];

        for (int x=0; x<n; x++){
            for (int y=0; y<m; y++){
                answer[x][y] = map[x][y];
            }
        }

        return answer;
    }
    static void storm(int r1, int c1, int r2, int c2){
        int x1 = r1 - 1; //1
        int y1 = c1 - 1; //1
        int x2 = r2 - 1; // 3
        int y2 = c2 - 1; // 4

        int first = map[x1][y2]; // 5

        // 윗 가로 변
        for (int y = y2; y>y1; y--){
            map[x1][y] = map[x1][y-1];
        }

        int second = map[x2][y2]; // 8

        // 오른쪽 세로 변
        for (int x = x2; x>x1; x--){
            map[x][y2] = map[x-1][y2];
        }
        map[x1+1][y2] = first;

        int third = map[x2][y1]; // 2

        // 아래 가로 변
        for (int y=y1; y<y2; y++){
            map[x2][y] = map[x2][y+1];
        }
        map[x2][y2-1] = second;

        int fourth = map[x1][y2]; // 6

        // 왼쪽 세로 변
        for (int x = x1; x<x2; x++){
            map[x][y1] = map[x+1][y1];
        }
        map[x2-1][y1] = third;
    }
    static void show(){
        for (int x=0; x<map.length; x++){
            for (int y=0; y<map[0].length; y++){
                System.out.print(map[x][y] + " ");
            }
            System.out.println();
        }
    }
    static void cal(int r1, int c1, int r2, int c2){
        int x1 = r1 - 1;
        int y1 = c1 - 1;
        int x2 = r2 - 1;
        int y2 = c2 - 1;

        for (int x=x1; x<=x2; x++){
            for (int y=y1; y<=y2; y++){
                int sum = map[x][y];
                int count = 1;
                for (int z = 0; z<4; z++){
                    int nx = x + dx[z];
                    int ny = y + dy[z];

                    if (nx < 0 || ny < 0 || nx >= map.length || ny >= map[0].length) continue;

                    sum += answer[nx][ny];
                    count++;
                }
                int avg = sum / count;
                map[x][y] = avg;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int q = sc.nextInt();

        map = new int[n][m];

        for (int x=0; x<n; x++){
            for (int y=0; y<m; y++){
                map[x][y] = sc.nextInt();
            }
        }
        for (int x=0; x<q; x++){
            int r1 = sc.nextInt();
            int c1 = sc.nextInt();
            int r2 = sc.nextInt();
            int c2 = sc.nextInt();

            storm(r1, c1, r2, c2);
            answer = init();
            cal(r1, c1, r2, c2);
        }
        show();
    }
}