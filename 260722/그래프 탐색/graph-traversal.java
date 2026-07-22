import java.util.*;

public class Main {
    static List<Integer>[] graph;
    static Set<Integer> visited;
    static void dfs(int node){
        visited.add(node);

        for (int nodes : graph[node]){
            if (visited.contains(nodes)) continue;

            dfs(nodes);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        graph = new ArrayList[n+1];
        visited = new HashSet<>();

        for (int x=0; x<=n; x++){
            graph[x] = new ArrayList<>();
        }

        for (int x=0; x<m; x++){
            int node1 = sc.nextInt();
            int node2 = sc.nextInt();

            graph[node1].add(node2);
            graph[node2].add(node1);
        }

        dfs(1);

        System.out.println(visited.size()-1);
    }
}