import java.util.*;
import java.io.*;

public class Main {
    static void func(int[] arr){
        for (int x=0; x<arr.length; x++){
            arr[x] = Math.abs(arr[x]);
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int[] arr = new int[n];
        for (int x=0; x<n; x++){
            arr[x] = Integer.parseInt(st.nextToken());
        }
        func(arr);

        for (int a : arr)
            System.out.print(a + " ");
    }
}