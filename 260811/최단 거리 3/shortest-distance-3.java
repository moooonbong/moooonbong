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

            int nowTo = now.to;
            int cost = now.cost;

            if (dist[nowTo] < cost) continue;

            for (Node next : graph[nowTo]){
                if (dist[next.to] > dist[nowTo] + next.cost){
                    dist[next.to] = dist[nowTo] + next.cost;

                    queue.offer(new Node(next.to, dist[next.to]));
                }
            }
        }
    }
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        graph = new ArrayList[n + 1];
        dist = new int[n + 1];

        Arrays.fill(dist, INF);

        for (int x=1; x<=n; x++){
            graph[x] = new ArrayList<>();
        }

        for (int x=0; x<m; x++){
            int v = sc.nextInt();
            int d = sc.nextInt();
            int c = sc.nextInt();

            graph[v].add(new Node(d, c));
            graph[d].add(new Node(v, c));
        }

        int a = sc.nextInt();
        int b = sc.nextInt();

        dijkstra(a);

        System.out.println(dist[b]);
    }
}