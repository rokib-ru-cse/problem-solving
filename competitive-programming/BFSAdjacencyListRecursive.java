import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFSAdjacencyListRecursive {
    private static int nodes;
    private static int edges;
    private static ArrayList<Integer>[] adjclg;
    private static int[] visited;
    private static Queue<Integer> qu = new LinkedList<>();

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
            adjclg[y].add(x);
        }
    }

    private static void bfs(int s) {
        if (qu.isEmpty())
            return;
        int node = qu.poll();
        System.out.print(node + " => ");
        for (int i = 0; i < adjclg[node].size(); i++) {
            if (visited[adjclg[node].get(i)] == 0) {
                qu.offer(adjclg[node].get(i));
                visited[adjclg[node].get(i)] = 1;
            }
        }
        if (!qu.isEmpty()) {
            bfs(qu.peek());
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
        qu.offer(1);
        visited[1] = 1;
        bfs(1);
    }
}
