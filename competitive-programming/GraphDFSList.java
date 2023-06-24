import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class GraphDFSList {
    private static int nodes;
    private static int edges;
    private static ArrayList<Integer>[] adjcl;
    private static int[] visited;

    private static void dfs(int s) {
        Stack<Integer> stk = new Stack<>();
        stk.push(s);
        visited[s] = 1;
        while (!stk.isEmpty()) {
            int node = stk.pop();
            System.out.print(node+" ");
            for (int i : adjcl[node]) {
                if (visited[i] == 0) {
                    stk.push(i);
                    visited[i] = 1;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        nodes = in.nextInt();
        edges = in.nextInt();
        visited = new int[nodes + 1];
        adjcl = new ArrayList[nodes + 1];
        for (int i = 1; i <= nodes; i++) {
            adjcl[i] = new ArrayList<>();
        }
        for (int i = 1; i < args.length; i++) {
            visited[i] = 0;
        }
        int x, y;
        for (int i = 0; i < edges; i++) {
            x = in.nextInt();
            y = in.nextInt();
            adjcl[x].add(y);
            adjcl[y].add(x);
        }
        dfs(1);

    }
}
