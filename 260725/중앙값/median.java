import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int x=0; x<t; x++){
            int n = sc.nextInt();

            PriorityQueue<Integer> queue1 = new PriorityQueue<>((a, b) -> b-a);
            PriorityQueue<Integer> queue2 = new PriorityQueue<>();
            int[] arr = new int[n];

            for(int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            for (int y = 0; y<n; y++){
                queue1.add(arr[y]);
                
                if (!queue2.isEmpty() && queue1.peek() > queue2.peek()){
                    queue2.add(queue1.poll());
                }
                if (queue1.size() > queue2.size()+1){
                    queue2.add(queue1.poll());
                }
                if (queue1.size() < queue2.size()){
                    queue1.add(queue2.poll());
                }
                if ((y+1) % 2 != 0){
                    System.out.print(queue1.peek() + " ");
                }
            }
            System.out.println();
        }
    
    }
}
