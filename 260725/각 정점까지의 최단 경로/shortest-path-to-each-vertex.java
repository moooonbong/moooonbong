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
        queue.offer(new Node(start, 0));
        dist[start] = 0;

        while(!queue.isEmpty()){
            Node now = queue.poll();
            int currentNode = now.to;
            int currentCost = now.cost;

            for (Node next : graph[currentNode]){
                int nextNode = next.to;
                int nextCost = next.cost;

                
                if (dist[nextNode] > dist[currentNode] + nextCost){
                    dist[nextNode] = dist[currentNode] + nextCost;
                }
                else {
                    continue;
                }
                
                queue.add(new Node(nextNode, dist[nextNode]));
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int k = sc.nextInt();

        graph = new ArrayList[n+1];
        dist = new int[n+1];
        for (int x=1; x<=n; x++){
            graph[x] = new ArrayList<>();
        }
        Arrays.fill(dist, INF);

        for (int x=0; x<m; x++){
            int v = sc.nextInt();
            int p = sc.nextInt();
            int c = sc.nextInt();

            graph[v].add(new Node(p, c));
            graph[p].add(new Node(v, c));
        }

        dijkstra(k);
        for (int x=1; x<=n; x++){
            if (dist[x] == INF)
                System.out.println(-1);
            else
                System.out.println(dist[x]);
        }

    }
}