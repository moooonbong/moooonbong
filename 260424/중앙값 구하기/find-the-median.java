import java.util.*;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int[] arr = new int[3];


        for (int x=0; x<3; x++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[x] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        System.out.println(arr[1]);
        
    }
}