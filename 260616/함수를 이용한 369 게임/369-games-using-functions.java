import java.util.*;
import java.io.*;

public class Main {
    static int func(int a, int b){
        int count = 0;

        for (int x=a; x<=b; x++){
            if (String.valueOf(x).contains("3") || String.valueOf(x).contains("6") || String.valueOf(x).contains("9") || x % 3 == 0){
                count++;
            }
        }

        return count;
    }
    public static void main(String[] args) throws IOException{
        // Please write your code here.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        System.out.print(func(a, b));
    }
}