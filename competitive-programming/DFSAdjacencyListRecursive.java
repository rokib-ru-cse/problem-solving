import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class DFSAdjacencyListRecursive {
    private static int nodes;
    private static int edges;
    private static ArrayList<Integer>[] adjclg;
    private static int[] visited;
    private static Stack<Integer> stk = new Stack<>();

    private static void initializedAdjcl() {
        for (int i = 1; i <= nodes; i++) {
            adjclg[i] = new ArrayList<>();
        }
    }

    private static void initializedVisited() {
        for (int i = 1; i <= nodes; i++) {
            visited[i] = 0;
        }
    }

    private static void getGraph() {
        Scanner in = new Scanner(System.in);
        int x, y;
        for (int i = 0; i < edges; i++) {
            x = in.nextInt();
            y = in.nextInt();
            adjclg[x].add(y);
        }
    }

    private static void dfs(int s) {
        if (stk.isEmpty())
            return;
        int node = stk.pop();
        visited[node] = 1;
        System.out.print(node + " => ");
        for (int i = 0; i <adjclg[node].size(); i++) {
            if(visited[adjclg[node].get(i)]==0){
                stk.push(adjclg[node].get(i));
                dfs(adjclg[node].get(i));
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        nodes = in.nextInt();
        edges = in.nextInt();
        adjclg = new ArrayList[nodes + 1];
        visited = new int[nodes + 1];
        initializedAdjcl();
        initializedVisited();
        getGraph();
        stk.push(1);
        visited[1]=1;
        dfs(1);
    }
}
