import java.util.*;
import java.io.*;

public class Main {
    static int gcd(int n, int m){
        if (m > n)
        {
            int temp = m;
            m = n;
            n = temp;
        }

        if (m == 0)
            return n;

        return gcd(m, n%m);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int value = gcd(n, m);

        int answer = (n * m) / value;
        System.out.println(answer);
    }
}