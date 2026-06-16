import java.util.*;
import java.io.*;

public class Main {
    static int min (int a, int b, int c){
        return Math.min(a, Math.min(b, c));
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        System.out.println(min(a, b, c));
    }
}