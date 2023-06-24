import java.util.*;

public class PracticeGraphBFSMatrix {
    private static int nodes;
    private static int edges;
    private static int[][] adjcm;

    private static void bfs(int s) {
        int[] visit = new int[nodes + 1];
        for (int i = 1; i <= nodes; i++) {
            visit[i] = 0;
        }
        Queue<Integer> qu = new LinkedList<>();
        qu.offer(s);
        visit[s] = 1;
        while (!qu.isEmpty()) {
            int node = qu.peek();
            qu.poll();
            System.out.print(node + " ");
            for (int j = 1; j <= nodes; j++) {
                if (adjcm[node][j] == 1) {
                    if (visit[j] == 0) {
                        qu.offer(j);
                        visit[j] = 1;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        PracticeGraphBFSMatrix pgb = new PracticeGraphBFSMatrix();
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
        bfs(3);

    }
}
