import java.util.ArrayList;
import java.util.Scanner;

public class DFSSubtree {
    private static int nodes;
    private static int edges;
    private static ArrayList<Integer>[] adjclt;
    private static int[] sum;
    private static int[] even;

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

    private static void dfs(int s) {
        if (s % 2 == 0) {
            even[s]++;
        }
        for (int i : adjclt[s]) {
            dfs(i);
            sum[s] = sum[s] + sum[i];
            even[s] = even[s] + even[i];
        }
    }

    private static void initializedSum() {
        for (int i = 1; i <= nodes; i++) {
            sum[i] = i;
        }
    }

    private static void initializedEven() {
        for (int i = 1; i <= nodes; i++) {
            even[i] = 0;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        nodes = in.nextInt();
        edges = in.nextInt();
        adjclt = new ArrayList[nodes + 1];
        sum = new int[nodes + 1];
        even = new int[nodes + 1];
        initializedAdjcl();
        initializedSum();
        initializedEven();
        getTree();
        dfs(1);

        System.out.println();
        for (int i = 1; i <= nodes; i++) {
            System.out.print(sum[i] + " ");
        }
        System.out.println();
        for (int i = 1; i <= nodes; i++) {
            System.out.print(even[i] + " ");
        }
    }
}
