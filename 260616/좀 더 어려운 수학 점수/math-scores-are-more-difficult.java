import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());


        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        if (a > c)
            System.out.println("A");
        else if (a == c){
            if (b > d)
                System.out.println("A");
            else 
                System.out.println("B");
        }
        else 
            System.out.println("B");


    }
}