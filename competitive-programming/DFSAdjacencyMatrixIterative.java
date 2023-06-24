import java.util.Scanner;
import java.util.Stack;

public class DFSAdjacencyMatrixIterative {
    private static int nodes;
    private static int edges;
    private static int[][] adjcmg;
    private static int[] visited;

    private static void initializedAdjcm(){
        for (int i = 1; i <=nodes; i++) {
            for (int j = 1; j <=nodes; j++) {
                adjcmg[i][j] = 0;
            }
        }
    }

    private static void getGraph(){
        int x,y;
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < edges; i++) {
            x = in.nextInt();
            y = in.nextInt();
            adjcmg[x][y] = 1;
            adjcmg[y][x] = 1;
        }
    }

    private static void dfs(int s){
        Stack<Integer> stk = new Stack<>();
        stk.push(s);
        visited[s] = 1;
        while(!stk.isEmpty()){
            int node = stk.pop();
            System.out.print(node+" => ");
            for (int i = 1; i <=nodes; i++) {
                if(adjcmg[node][i]==1){
                    if(visited[i]==0){
                        stk.push(i);
                        visited[i] = 1;
                    }
                }
            }
        }
    }

    private static void initializedVisited(){
        for (int i = 1; i <=nodes; i++) {
            visited[i] = 0;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        nodes = in.nextInt();
        edges = in.nextInt();
        adjcmg = new int[nodes+1][nodes+1];
        visited = new int[nodes+1];
        initializedAdjcm();
        initializedVisited();
        getGraph();
        dfs(1);
    }
}
