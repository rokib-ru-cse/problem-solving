import java.util.ArrayList;
import java.util.Scanner;

public class AdjacencyListGraph {
    public static void main(String[] args) {
        int nodes, edges;
        Scanner in = new Scanner(System.in);
        nodes = in.nextInt();
        edges = in.nextInt();
        ArrayList<Integer>[] adjl = new ArrayList[nodes+1];
        for (int i = 1; i <= nodes; i++) {
            adjl[i] = new ArrayList<>();
        }
        int x,y;
        for (int i = 0; i < edges; i++) {
            x = in.nextInt();
            y = in.nextInt();
            adjl[x].add(y);
            adjl[y].add(x);
        }
        System.out.println("undirected graph using adjacency list : ");
        for (int i = 1; i <= nodes; i++) {
            for (int z : adjl[i]) {
                System.out.print(z+" ");
            }
            System.out.println();
        }

    }
}
