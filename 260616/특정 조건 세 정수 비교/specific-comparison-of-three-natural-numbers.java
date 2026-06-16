import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int min = Math.min(a, Math.min(b, c));

        System.out.print(a == min ? 1 : 0);
        System.out.print(" ");
        System.out.println(a == b && b == c ? 1 : 0);
    }
}