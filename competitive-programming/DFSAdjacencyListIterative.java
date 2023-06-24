import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class DFSAdjacencyListIterative {
    private static int nodes;
    private static int edges;
    private static ArrayList<Integer>[] adjclg;
    private static int[] visited;

    private static void initializedAdjcl(){
        for (int i = 1; i <=nodes; i++) {
            adjclg[i] = new ArrayList<>();
        }
    }

    private static void initializedVisited(){
        for (int i = 1; i <=nodes; i++) {
            visited[i] = 0;
        }
    }

    private static void getGraph(){
        Scanner in = new Scanner(System.in);
        int x,y;
        for (int i = 0; i < edges; i++) {
            x = in.nextInt();
            y = in.nextInt();
            adjclg[x].add(y);
            adjclg[y].add(x);
        }
    }

    private static void dfs(int s){
        Stack<Integer> stk = new Stack<>();
        stk.push(s);
        visited[s] = 1;
        while(!stk.isEmpty()){
            int node = stk.pop();
            System.out.print(node+" => ");
            for (int i = 0; i < adjclg[node].size(); i++) {
                if(visited[adjclg[node].get(i)]==0){
                    stk.push(adjclg[node].get(i));
                    visited[adjclg[node].get(i)]=1;
                }
            } 
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
        dfs(1);
    }
}
