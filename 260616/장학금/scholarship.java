import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());


        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        if (a >= 90){
            if (b >= 95)
                System.out.println(100000);
            else if (b >= 90)
                System.out.println(50000);
            else 
                System.out.println(0);
        }
        else 
            System.out.println(0);
    }
}