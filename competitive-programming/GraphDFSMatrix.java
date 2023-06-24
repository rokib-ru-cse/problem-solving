import java.util.Scanner;
import java.util.Stack;

public class GraphDFSMatrix {
    private static int nodes;
    private static int edges;
    private static int[][] adjcm;

    private static void dfs(int s) {
        int[] visit = new int[nodes + 1];
        for (int i = 1; i < visit.length; i++) {
            visit[i] = 0;
        }
        Stack<Integer> stk = new Stack<>();
        stk.push(s);
        while (!stk.isEmpty()) {
            int node = stk.pop();
            visit[node] = 1;
            System.out.print(node + " ");
            for (int i = 1; i <= nodes; i++) {
                if (adjcm[node][i] == 1) {
                    if (visit[i] == 0) {
                        stk.push(i);
                        visit[i] = 1;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        nodes = in.nextInt();
        edges = in.nextInt();
        adjcm = new int[nodes + 1][nodes + 1];
        int x, y;
        for (int i = 0; i < edges; i++) {
            x = in.nextInt();
            y = in.nextInt();
            adjcm[x][y] = 1;
            adjcm[y][x] = 1;
        }
        dfs(1);
    }
}
