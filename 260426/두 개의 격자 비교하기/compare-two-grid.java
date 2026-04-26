import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] arr = new int[N][M];
        int[][] brr = new int[N][M];

        for (int x=0; x<N; x++){
            st = new StringTokenizer(br.readLine());

            for (int y=0; y<M; y++){
                arr[x][y] = Integer.parseInt(st.nextToken());
            }
        }

        for (int x=0; x<N; x++){
            st = new StringTokenizer(br.readLine());

            for (int y=0; y<M; y++){
                brr[x][y] = Integer.parseInt(st.nextToken());

                if (arr[x][y]==brr[x][y]){
                    System.out.print(0 + " ");
                }
                else {
                    System.out.print(1 + " ");
                }
            }
            System.out.println();
        }
    }
}