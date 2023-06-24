import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFSAdjacencyMatrixRecursive {
    private static int nodes;
    private static int edges;
    private static int[][] adjcmg;
    private static int[] visisted;
    private static Queue<Integer> qu = new LinkedList<>();

    private static void getGraph() {
        Scanner in = new Scanner(System.in);
        int x, y;
        for (int i = 0; i < edges; i++) {
            x = in.nextInt();
            y = in.nextInt();
            adjcmg[x][y] = 1;
            adjcmg[y][x] = 1;
        }
    }

    private static void initializedAdjcmg() {
        for (int i = 1; i <= nodes; i++) {
            for (int j = 1; j <= nodes; j++) {
                adjcmg[i][j] = 0;
            }
        }
    }

    private static void bfs(int s) {
        int node;
        if (qu.isEmpty())
            return;
        node = qu.poll();
        System.out.print(node + " => ");
        visisted[node] = 1;
        for (int i = 1; i <= nodes; i++) {
            if (adjcmg[node][i] == 1) {
                if (visisted[i] == 0) {
                    qu.offer(i);
                    visisted[i] = 1;
                }
            }
        }
        if(!qu.isEmpty()){
            bfs(qu.peek());
        }
    }

    private static void initializedVisited() {
        for (int i = 1; i <= nodes; i++) {
            visisted[i] = 0;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        nodes = in.nextInt();
        edges = in.nextInt();
        adjcmg = new int[nodes + 1][nodes + 1];
        visisted = new int[nodes + 1];
        initializedAdjcmg();
        initializedVisited();
        getGraph();
        qu.offer(1);
        visisted[1] = 1;
        bfs(1);
    }
}
