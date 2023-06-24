import java.util.*;


public class DFSEdgeDeletion {
    private static int nodes;
    private static int edges;
    private static ArrayList<Integer>[] adjclt;
    private static int[] sum;
    private static int[] weight;

    private static void initializedAdjcl() {
        for (int i = 1; i <= nodes; i++) {
            adjclt[i] = new ArrayList<>();
        }
    }

    private static void initializedSum(){
        for (int i = 1; i <=nodes; i++) {
            sum[i] = 0;
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
    private static void getWeight(){
        Scanner in = new Scanner(System.in);
        for (int i = 1; i <=nodes; i++) {
            weight[i] = in.nextInt();
        }
    }

    private static void dfs(int parent, int vertex) {

        sum[vertex] += weight[vertex];

        for (int child : adjclt[vertex]) {
            if (parent != child) {
                dfs(vertex, child);
                sum[vertex] += sum[child];
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        nodes = in.nextInt();
        edges = in.nextInt();
        adjclt = new ArrayList[nodes + 1];
        sum = new int[nodes+1];
        weight = new int[nodes+1];
        initializedAdjcl();
        initializedSum();
        getTree();
        getWeight();
        dfs(0, 1);
        for (int i = 1; i <=nodes; i++) {
            System.out.print(sum[i]+" ");
        }
        int ans = 0;
        for (int i = 2; i <= nodes; ++i) {
            int part1 = sum[i];
            int part2 = sum[1]-sum[i];
            ans  = Math.max(ans,(part1*part2));
        }
        System.out.println("\nMaximum product is : "+ans);
    }
}
