import java.util.Scanner;

public class DFSAdjacencyMatrixRecursive {
    private static int nodes;
    private static int edges;
    private static int[][] adjcmg;
    private static int[] visisted;
    private static void getGraph(){
        Scanner in = new Scanner(System.in);
        int x,y;
        for (int i = 0; i < edges; i++) {
            x = in.nextInt();
            y = in.nextInt();
            adjcmg[x][y] = 1;
            adjcmg[y][x] = 1;
        }
    }
    private static void initializedAdjcmg(){
        for (int i = 1; i <=nodes; i++) {
            for (int j = 1; j <=nodes; j++) {
                adjcmg[i][j] = 0;
            }
        }
    }
    private static void dfs(int s){
        if(visisted[s]==1) return;
        visisted[s] = 1;
        System.out.print(s+" => ");
        for (int i = 1; i <=nodes; i++) {
            if(adjcmg[s][i]==1){
                dfs(i);
            }
        }
    }
    private static void initializedVisited(){
        for (int i = 1; i <=nodes; i++) {
            visisted[i] = 0;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        nodes = in.nextInt();
        edges = in.nextInt();
        adjcmg = new int[nodes+1][nodes+1];
        visisted = new int[nodes+1];
        initializedAdjcmg();
        initializedVisited();
        getGraph();
        dfs(1);
    }
}
