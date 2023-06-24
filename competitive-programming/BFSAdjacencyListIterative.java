import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFSAdjacencyListIterative {
    private static int nodes;
    private static int edges;
    private static ArrayList<Integer>[] adjclg;
    private static int[] visited;
    private static Queue<Integer> qu = new LinkedList();

    private static void initializedAdjcl(){
        for (int i = 1; i <= nodes;i++) {
            adjclg[i] = new ArrayList<>();
        }
    }
    private static void initializedVisited(){
        for (int i = 1; i <=nodes; i++) {
            visited[i] = 0;
        }
    }
    public static void bfs(int s) {
        qu.offer(s);
        visited[s] = 1;
        while(!qu.isEmpty()){
            int node = qu.poll();
            System.out.print(node+" => ");
            for (int i = 0; i < adjclg[node].size(); i++) {
                if(visited[adjclg[node].get(i)]==0){
                    qu.offer(adjclg[node].get(i));
                    visited[adjclg[node].get(i)] = 1;
                }
            }
        }
    }
    private static void getGraph(){
        int x,y;
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < edges; i++) {
            x = in.nextInt();
            y = in.nextInt();
            adjclg[x].add(y);
            adjclg[y].add(x);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        nodes = in.nextInt();
        edges = in.nextInt();
        adjclg = new ArrayList[nodes+1];
        visited = new int[nodes+1];
        initializedAdjcl();
        initializedVisited();
        getGraph();
        bfs(1);
    }
}
