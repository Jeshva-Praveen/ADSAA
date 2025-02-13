import java.util.ArrayList;
import java.util.List;
class DFS {
    static void dfsRec(List<List<Integer>> adj, boolean[] visited, int s) {
        visited[s] = true;
        System.out.print(s + " ");
        for (int i : adj.get(s)) {
            if (!visited[i]) {
                dfsRec(adj, visited, i);
            }
        }
    }
    static void dfs(List<List<Integer>> adj, int s) {
        boolean[] visited = new boolean[adj.size()];
        dfsRec(adj, visited, s);
    }
    static void addEdge(List<List<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    public static void main(String[] args) {
        int V = 5; 
        List<List<Integer>> adj = new ArrayList<>(V);
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        int[][] edges = { { 1, 2 }, { 1, 0 }, { 2, 0 }, { 2, 3
        }, { 2, 4 } };
        for (int[] e : edges) {
            addEdge(adj, e[0], e[1]);
        }
        dfs(adj, 0);
    }
}