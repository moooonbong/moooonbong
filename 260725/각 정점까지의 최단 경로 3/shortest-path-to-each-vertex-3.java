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
        queue.add(new Node(start, 0));
        dist[start] = 0; 

        while(!queue.isEmpty()){
            Node now = queue.poll();
            int current = now.to;
            int cost = now.cost;

            for (Node next : graph[current]){
                int nextCost = next.cost;
                int nextPos = next.to;

                if (dist[nextPos] > dist[current] + nextCost){
                    dist[nextPos] = dist[current] + nextCost;
                }
                else {
                    continue;
                }

                queue.add(new Node(nextPos, nextCost));
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
        Arrays.fill(dist, INF);

        for (int x=1; x<=n; x++){
            graph[x] = new ArrayList<>();
        }

        for (int x=0; x<m; x++){
            int s = sc.nextInt();
            int next = sc.nextInt();
            int c = sc.nextInt();
            graph[s].add(new Node(next, c));
        }

        dijkstra(1);
        for (int x=2; x<=n; x++){
            if (dist[x] == INF)
                System.out.println(-1);
            else {
                System.out.println(dist[x]);
            }
        }
    }
}