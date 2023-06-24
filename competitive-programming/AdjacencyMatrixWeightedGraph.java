import java.util.*;

public class AdjacencyMatrixWeightedGraph {
    private static int nodes;
    private static int edges;
    private static int[][] adjcmwg;

    private static void initializedAdjcmw() {
        for (int i = 1; i <= nodes; i++) {
            for (int j = 1; j <= nodes; j++) {
                adjcmwg[i][j] = 0;
            }
        }
    }

    public static void p() {
        for (int i = 1; i <= nodes; i++) {
            for (int j = 1; j <= nodes; j++) {
                System.out.print(adjcmwg[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void getGraphInput() {
        Scanner in = new Scanner(System.in);
        int x, y, w;
        for (int i = 0; i < edges; i++) {
            x = in.nextInt();
            y = in.nextInt();
            w = in.nextInt();
            adjcmwg[x][y] = w;
            adjcmwg[y][x] = w;
        }
    }

    private static void printGraph() {
        for (int i = 1; i <= nodes; i++) {
            for (int j = 1; j <= nodes; j++) {
                if (adjcmwg[i][j] != 0) {
                    System.out.println(i + " -> " + j + " = " + adjcmwg[i][j]);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        nodes = in.nextInt();
        edges = in.nextInt();
        adjcmwg = new int[nodes + 1][nodes + 1];
        initializedAdjcmw();
        getGraphInput();
        printGraph();
    }
}
