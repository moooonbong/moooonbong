import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int x=0; x<4; x++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int sum = 0;
            for (int y=0; y<4; y++){
                int a = Integer.parseInt(st.nextToken());
                sum += a;
            }

            System.out.println(sum);
        }
    }
}