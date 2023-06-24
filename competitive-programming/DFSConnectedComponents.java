import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class DFSConnectedComponents {
    private static int nodes;
    private static int edges;
    private static ArrayList<Integer>[] adjclg;
    private static int[] visited;
    private static int count;
    private static ArrayList<ArrayList<Integer>> connectedGraph = new ArrayList<>();
private static ArrayList<Integer> oneComponnet ;
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
        java.util.Scanner in = new java.util.Scanner(System.in);
        int x, y;
        for (int i = 0; i < edges; i++) {
            x = in.nextInt();
            y = in.nextInt();
            adjclg[x].add(y);
            adjclg[y].add(x);
        }
    }

    private static void dfs(int s) {
        visited[s] = 1;
        oneComponnet.add(s);
        for (int i : adjclg[s]) {
            if (visited[i] == 0) {
                dfs(i);
            }
        }
    }

    public static void main(String[] args) {
        java.util.Scanner in = new java.util.Scanner(System.in);
        nodes = in.nextInt();
        edges = in.nextInt();
        adjclg = new ArrayList[nodes + 1];
        visited = new int[nodes + 1];
        initializedAdjcl();
        initializedVisited();
        getGraph();
        for (int i = 1; i <= nodes; i++) {
            if (visited[i] == 0) {
                oneComponnet =  new ArrayList<>();
                dfs(i);
                count++;
                connectedGraph.add(oneComponnet);
            }
        }
        // System.out.println("Total Connected Components are = " + count);
        System.out.println(count);
        for (ArrayList oneComponent : connectedGraph) {
            System.out.println(oneComponent);
        }
    }
}