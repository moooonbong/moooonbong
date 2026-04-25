import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[N];

        for (int x=0; x<N; x++){
            arr[x] = Integer.parseInt(st.nextToken());
        }

        for (int x = N-1; x>=0; x--){
            if (arr[x]%2==0)
                System.out.print(arr[x] + " ");
        }
    }
}