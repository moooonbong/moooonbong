import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());   

        int N = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int x=0; x<N; x++){
            arr[x] = Integer.parseInt(st.nextToken());
            System.out.print(((arr[x]* arr[x]) + " "));
        }
    }
}