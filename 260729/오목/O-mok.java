import java.util.*;

public class Main {
    static int[][] map;
    static boolean[][] visited;
    static int[] answer;
    static boolean check(int value, int x, int y){
        boolean flag = true;

        if (y <= 15){
            // 가로 확인
            for (int i=y; i<y+5; i++){
                if (map[x][i] != value){
                    flag = false;
                    break;
                }
            }   
            if (flag){
                answer[0] = x;
                answer[1] = y + 2;
                return flag;
            }
        }
        
        if (x <= 15){
            flag = true;
            // 세로 확인
            for (int i=x; i<x+5; i++){
                if (map[i][y] != value){
                    flag = false;
                    break;
                }
            }

            if (flag){
                answer[0] = x + 2;
                answer[1] = y;
                return flag;
            }
        }
        
        if (x <= 15 && y <= 15){
            flag = true;
            // 오른 방향 대각선 확인
            for (int i=0; i<5; i++){
                if (map[x+i][y+i] != value){
                    flag = false;
                    break;
                }
            }

            if (flag){
                answer[0] = x + 2;
                answer[1] = y + 2;
                return flag;
            }
        }
        
        if (x <= 15 && y >= 5){
            flag = true;
            // 왼 방향 대각선 확인
            for (int i=0; i<5; i++){
                if(map[x+i][y-i] != value){
                    flag = false;
                    break;
                }
            }
        
            if (flag){
                answer[0] = x + 2;
                answer[1] = y - 2;
                return flag;
            }
        }
        
        if (x > 15 || y > 15)
            return false;
      
        return flag;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        map = new int[20][20];
        visited = new boolean[20][20];
        answer = new int[2];

        for (int x=1; x<20; x++){
            for (int y=1 ;y<20; y++){
                map[x][y] = sc.nextInt();
            }
        }

        for (int x=1; x<=19; x++){
            for (int y=1; y<=19; y++){
                if (map[x][y] != 0){
                    if (check(map[x][y] , x, y)){
                        System.out.println(map[x][y]);
                        System.out.println(answer[0] + " " + answer[1]);
                        return;
                    }
                }
            }
        }
        System.out.println(0);
    }
}