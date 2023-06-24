import java.util.Scanner;

public class AdjacencyMatrixGraph {

    public static void main(String[] args) {
        int nodes, edges;
        Scanner in = new Scanner(System.in);
        nodes = in.nextInt();
        edges = in.nextInt();

        int[][] adjl = new int[nodes+1][nodes+1];
        for (int i = 1; i <= nodes; i++) {
           for (int j = 1; j <= nodes; j++) {
               adjl[i][j] = 0;
           }
        }
        int x,y;
        for (int i = 0; i < edges; i++) {
            x = in.nextInt();
            y = in.nextInt();
            adjl[x][y] = 1;
            adjl[y][x] = 1;
        }
        System.out.println("undirected graph using adjacency matrix : ");
        for (int i = 1; i <= nodes; i++) {
            for (int j = 1; j <= nodes; j++) {
               System.out.print(adjl[i][j]+" ");
            }
            System.out.println();
         }

    }
}