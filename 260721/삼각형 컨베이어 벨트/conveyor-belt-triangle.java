import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int t = sc.nextInt();

        int[][] arr = new int[3][n];

        for (int x=0; x<3; x++){
        
            for (int y=0; y<n; y++){
                arr[x][y] = sc.nextInt();
            }
        }

        for (int time = 0; time < t; time++){
            int temp = arr[2][n-1];

            for (int x=2; x>=0; x--){
                int upTemp = 0;
                if (x > 0)
                    upTemp = arr[x-1][n-1];
                else {
                    upTemp = temp;
                }

                for (int y=n-1; y>=1; y--){
                    arr[x][y] = arr[x][y-1];
                }
                arr[x][0] = upTemp;
            }

            arr[0][0] = temp;
        }

        for (int x=0; x<3; x++){
            for (int y=0; y<n; y++){
                System.out.print(arr[x][y] + " ");
            }
            System.out.println();
        }
    }
}

