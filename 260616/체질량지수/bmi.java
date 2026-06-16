import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int h = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());

        int b = (10000 * w) / (h * h);

        if (b >= 25){
            System.out.println(b+ "\n" + "Obesity");
        }else
        {
            System.out.println(b);
        }
    }
}