import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());


        int a = Integer.parseInt(st.nextToken());
        String b = st.nextToken();

        st = new StringTokenizer(br.readLine());

        int c = Integer.parseInt(st.nextToken());
        String d = st.nextToken();

        if ((a >= 19 && b.equals("M")) || (c >= 19 && d.equals("M")))
            System.out.println(1);
        else 
            System.out.println(0);

    }
}