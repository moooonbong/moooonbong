import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        Deque<Integer> queue = new ArrayDeque<>();
        List<Integer> list = new ArrayList<>();
        
        for (int x=1; x<=a; x++){
            queue.offer(x);
        }

        int people = 0;
        int count = 1;
        while(!queue.isEmpty()){
            if (count == b){
                list.add(queue.poll());
                people++;
                count = 1;
                continue;
            }

            queue.offer(queue.poll());
            count++;
        }

        for (int x=0; x<list.size(); x++)
            System.out.print(list.get(x) + " ");
    }
}