import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());


        String a = st.nextToken();
        int b = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        String c = st.nextToken();
        int d = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        String e = st.nextToken();
        int f = Integer.parseInt(st.nextToken());

        int count = 0;

        if (a.equals("Y")){
            if (b >= 37)
                count++;
        }

        if (c.equals("Y")){
            if (d >= 37)
                count++;
        }

        if (e.equals("Y")){
            if (f >= 37)
                count++;
        }

        if (count >= 2)
            System.out.println("E");
        else
            System.out.println("N");

    }
}