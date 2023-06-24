import java.util.Scanner;

public class PracticeAMG {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int nodes = in.nextInt();
        int edges = in.nextInt();
        int[][] adjcm = new int[nodes+1][nodes+1];

        for (int i =1; i <= nodes; i++) {
            for (int j = 1; j <=nodes; j++) {
                adjcm[i][j] = 0;
            }
        }
        int x,y;
        for (int i = 0; i < edges; i++) {
            x = in.nextInt();
            y = in.nextInt();
            adjcm[x][y] = 1;
            adjcm[y][x] = 1;
        }
        System.out.println("graph using adjc matrix : ");
        for (int i =1; i <= nodes; i++) {
            for (int j = 1; j <=nodes; j++) {
                System.out.print(adjcm[i][j]+" ");
            }
            System.out.println();
        }

    }
}