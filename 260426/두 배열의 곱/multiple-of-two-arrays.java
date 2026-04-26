import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] arr = new int[3][3];
        int[][] brr = new int[3][3];

        for (int x=0; x<3; x++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int y=0; y<3; y++){
                arr[x][y] = Integer.parseInt(st.nextToken());
                brr[x][y] = arr[x][y] + 1;
                System.out.print((arr[x][y] * brr[x][y]) + " ");
            }
            System.out.println();
        }
    }
}