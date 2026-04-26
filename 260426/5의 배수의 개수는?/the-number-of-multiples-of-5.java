import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = 0;
        for (int x=0; x<4; x++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int y=0; y<4; y++){
                int a = Integer.parseInt(st.nextToken());
                if (a % 5 == 0)
                    count++;
            }
        }
        System.out.println(count);
    }
}