import java.util.*;

public class Main {
    static class Node{
        int to; 
        int cost;
        Node(int to, int cost){
            this.to = to;
            this.cost = cost;
        }
    }
    static List<Node>[] graph;
    static int[] dist;
    static int INF = Integer.MAX_VALUE;
    static void dijkstra(int start){
        PriorityQueue<Node> queue = new PriorityQueue<>((a, b) -> a.cost - b.cost);
        queue.add(new Node(start,0));
        Arrays.fill(dist, INF);
        dist[start] = 0;

        while(!queue.isEmpty()){
            Node now = queue.poll();

            int current = now.to;
            int currentCost = now.cost;

            if (currentCost > dist[current]) continue;
            

            for (Node next : graph[current]){
                int nextPos = next.to;
                int nextCost = next.cost;

                if (dist[nextPos] > dist[current] + nextCost){
                    dist[nextPos] = dist[current] + nextCost;
                    queue.add(new Node(nextPos, dist[nextPos]));
                }
            }
        }
    }
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        
        graph = new ArrayList[n+1];
        dist = new int[n+1];

        for (int x=1; x<=n; x++){
            graph[x] = new ArrayList<>();
        }

        for (int x=0; x<m; x++){
            int v = sc.nextInt();
            int d = sc.nextInt();
            int c = sc.nextInt();

            graph[d].add(new Node(v, c));
        }

        int max = 0;
        dijkstra(n);

        for (int x=1; x<n; x++){
            max = Math.max(max, dist[x]);
        }
        
        System.out.println(max);
    }
}