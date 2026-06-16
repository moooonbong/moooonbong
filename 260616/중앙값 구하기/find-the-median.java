import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());


        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int max = Math.max(a, Math.max(b, c));
        int min = Math.min(a, Math.min(b, c));

        if (a == max){
            if (b == min)
                System.out.println(c);
            else if (c == min)
                System.out.println(b);
        }
        else if (b == max){
            if (a == min)
                System.out.println(c);
            else if (c == min)
                System.out.println(a);
        }
        else {
            if (a == min)
                System.out.println(b);
            else if (b == min)
                System.out.println(a);
        }
    }
}