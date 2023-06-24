import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class DFSTreeDiameter {
    private static int nodes;
    private static int edges;
    private static int leaf;
    private static int second;
    private static int[] depth;

    private static ArrayList<Integer>[] adjclt;

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
            adjclt[y].add(x);
        }
    }

    private static void dfs(int parent, int child) {
        for (int i : adjclt[child]) {
            if (parent != i) {
                depth[i] = depth[child] + 1;
                dfs(child, i);
            }
        }
    }

    private static void initializedDepth() {
        for (int i = 1; i <= nodes; i++) {
            depth[i] = 0;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        nodes = in.nextInt();
        edges = in.nextInt();
        adjclt = new ArrayList[nodes + 1];
        depth = new int[nodes + 1];
        initializedAdjcl();
        initializedDepth();
        getTree();
        dfs(0, 1);
        for (int i = 1; i <= nodes; i++) {
            System.out.print(depth[i] + " ");
        }
        System.out.println();
        for (int i = 1; i <nodes; i++) {
            if(depth[i]<=depth[i+1]){
                leaf = i+1;
            }
        }
        initializedDepth();
        dfs(0, leaf);
        for (int i = 1; i <nodes; i++) {
            if(depth[i]<=depth[i+1]){
                second = i+1;
            }
        }
        for (int i = 1; i <= nodes; i++) {
            System.out.print(depth[i] + " ");
        }
        System.out.println();
        System.out.println(leaf + " " + second);
        System.out.println(depth[second]);
    }
}
