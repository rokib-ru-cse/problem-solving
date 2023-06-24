import java.util.ArrayList;
import java.util.Scanner;

public class DFSHeightDepthTree {
    private static int nodes;
    private static int edges;
    private static ArrayList<Integer>[] adjclt;
    private static int[] depth;
    private static int[] height;
    private static void initializedAdjcl() {
        for (int i = 1; i <= nodes; i++) {
            adjclt[i] = new ArrayList<>();
        }
    }

    private static void getTree() {
        Scanner in = new Scanner(System.in);
        int x, y;
        for (int i = 0; i < edges; i++) {
            x = in.nextInt();
            y = in.nextInt();
            adjclt[x].add(y);
        }
    }

    private static void dfs(int s){
        
        for (int i : adjclt[s]) {
            depth[i] = depth[s]+1;
            dfs(i);
            height[s] = Math.max(height[s], height[i]+1);
        }
    }

    private static void initializedHeight(){
        for (int i = 1; i <=nodes; i++) {
            height[i] = 0;
        }
    }
    private static void initializedDepth(){
        for (int i = 1; i <=nodes; i++) {
            depth[i] = 0;
        }
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        nodes = in.nextInt();
        edges = in.nextInt();
        adjclt = new ArrayList[nodes + 1];
        height = new int[nodes+1];
        depth = new int[nodes+1];
        initializedAdjcl();
        initializedHeight();
        initializedDepth();
        getTree();
        depth[1]=0;
        dfs(1);
        for (int i = 1; i <=nodes; i++) {
            System.out.print(depth[i]+" ");
        }
        System.out.println();
        for (int i = 1; i <=nodes; i++) {
            System.out.print(height[i]+" ");
        }
    }
}
