import java.util.*;

class Main{
    static int[][] map;
    static int n;
    static int m;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        map = new int[n][m];

        for (int x=0; x<n; x++){
            for (int y=0; y<m; y++){
                map[x][y] = sc.nextInt();
            }
        }

        int max = 0;

        for (int height = 1; height<=n; height++){
            for (int width = 1; width<=m; width++){
                if (check(height, width)){
                    max = Math.max(max, height * width);
                }
            }
        }
        System.out.println(max == 0 ? -1 : max);
    }

    static boolean check(int height, int width) {
        boolean flag = true;

        for (int x=0; x<=n-height; x++){
            for (int y=0; y<=m-width; y++){
                flag = true;
                for (int h=x; h<x+height; h++){
                    for (int w = y; w<y+width; w++){
                        if (map[h][w] <= 0){
                            flag = false;
                            break;
                        }
                    }
                    if (!flag){
                        break;
                    }
                }
                if (flag){
                    return true;
                }
            }
        }
        return false;
    }
}