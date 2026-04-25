import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());

        int amount = 0;

        for (int x=start; x<=end; x++){
            int count = 0;
            for (int y=1; y<=x; y++){
                if (x % y == 0){
                    count++;
                }
            }

            if (count==3)
                amount++;
        }
        System.out.println(amount);
    }
}