import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());

        System.out.println(a > b ? 1 : 0);
        System.out.println(a > c ? 1 : 0);
        System.out.println(a > d ? 1 : 0);
        System.out.println(a > e ? 1 : 0);
    }
}