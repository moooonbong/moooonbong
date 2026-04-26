import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] arr = new int[4][4];

        for (int x=0; x<4; x++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int y=0; y<4; y++){
                arr[x][y] = Integer.parseInt(st.nextToken());
            }
        }

        int sum = 0;
        for (int x=0; x<4; x++){
            for (int y=0; y<x+1; y++){
                sum += arr[x][y];
            }
        }

        System.out.println(sum);
    }
}