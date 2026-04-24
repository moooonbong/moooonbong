import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int[][] arr = new int[2][2];
        for (int x=0; x<2; x++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            arr[x][0] = Integer.parseInt(st.nextToken());
            arr[x][1] = Integer.parseInt(st.nextToken());
        }

        if (arr[0][0] > arr[1][0] && arr[0][1] > arr[1][1])
            System.out.println(1);
        else 
            System.out.println(0);
    }
}