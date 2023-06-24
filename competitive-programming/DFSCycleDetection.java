import java.util.ArrayList;
import java.util.Scanner;

public class DFSCycleDetection {
    private static int nodes;
    private static int edges;
    private static ArrayList<Integer>[] adjclg;
    private static int[] visited;
    private static boolean flag;

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

    private static void dfs(int parent,int child) {
        visited[child] = 1;
        for (int i : adjclg[child]) {
            if (visited[i] == 1 && parent==i) {
                continue;
            } 
            if(visited[i] == 1){
                flag = true;
                return;
            }
            dfs(child,i);
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
        for (int i = nodes; i >=1; i--) {
            if (visited[i] == 0) {
                dfs(0,i);
            }
        }
        // System.out.println("Total Connected Components are = " + count);
        if(flag){
            System.out.println("Yes there exist cycle in this graph");
        }else{
            System.out.println("No there is no cycle in this graph");
        }
    }
}