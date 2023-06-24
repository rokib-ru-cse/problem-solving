import java.util.*;

public class DFSLowestCommonAncestor {
    private static int nodes;
    private static int edges;
    private static ArrayList<Integer>[] adjclt;
    private static ArrayList<Integer>[] depth;
    private static int first;
    private static int second;
    private static int[] allParent;

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

    private static void initializedParent() {
        for (int i = 1; i <= nodes; i++) {
            allParent[i] = 0;
        }
    }

    private static void dfs(int parent, int child) {

        allParent[child] = parent;
        for (int i : adjclt[child]) {
            if (parent != i) {
                dfs(child, i);
            }
        }
    }

    private static void path(int index, int value) {
        if (value == 0) {
            return;
        }
        depth[index].add(value);
        path(index, allParent[value]);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        nodes = in.nextInt();
        edges = in.nextInt();
        adjclt = new ArrayList[nodes + 1];
        depth = new ArrayList[2];
        depth[0] = new ArrayList<>();
        depth[1] = new ArrayList<>();
        allParent = new int[nodes + 1];
        initializedAdjcl();
        initializedParent();
        getTree();
        first = in.nextInt();
        second = in.nextInt();
        dfs(0, 1);
        for (int i = 1; i <= nodes; i++) {
            System.out.print(allParent[i] + " ");
        }
        path(0, first);
        path(1, second);
        System.out.println();
        for (ArrayList arr : depth) {
            System.out.println(arr);
        }
        Collections.reverse(depth[0]);
        Collections.reverse(depth[1]);
        int lca = 0;
        int min = Math.min(depth[0].size(), depth[1].size());
        for (int i = 0; i < min; i++) {
            if (depth[0].get(i) == depth[1].get(i)) {
                lca = depth[0].get(i);
            } else {
                break;
            }
        }
        System.out.println(lca);
    }
}
