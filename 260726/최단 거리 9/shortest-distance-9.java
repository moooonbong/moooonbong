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
    static int[] path;
    static int INF = Integer.MAX_VALUE;
    static void dijkstra(int start){
        PriorityQueue<Node> queue = new PriorityQueue<>((a, b) -> a.cost - b.cost);
        queue.add(new Node(start, 0));
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
                    path[nextPos] = current;
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
        for (int x=1; x<=n; x++){
            graph[x] = new ArrayList<>();
        }
        dist = new int[n+1];
        Arrays.fill(dist, INF);

        path = new int[n+1];

        for (int x=0; x<m; x++){
            int v = sc.nextInt();
            int p = sc.nextInt();
            int c = sc.nextInt();

            graph[v].add(new Node(p, c));
            graph[p].add(new Node(v, c));
        }

        int start = sc.nextInt();
        int end = sc.nextInt();

        dijkstra(start);
        System.out.println(dist[end]);

        List<Integer> list = new ArrayList<>();

        int cur = end;
        while(true){
            if (cur == 0)
                break;
            list.add(cur);

            cur = path[cur];
            
        }
        for (int x=list.size()-1; x>=0; x--){
            System.out.print(list.get(x) + " ");
        }
    }
}