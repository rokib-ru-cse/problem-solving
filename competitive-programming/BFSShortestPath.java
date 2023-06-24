// import java.util.ArrayList;
// import java.util.LinkedList;
// import java.util.Queue;
// import java.util.Scanner;

// class Pair<U,V>{
//     private final U first;
//     private final V second;

//     Pair(U v1,V v2){
//         first = v1;
//         second = v2;
//     }
//     public String toString(){
//         return first+" "+second;
//     }
//     public U first(){
//         return first;
//     }
//     public V second(){
//         return second;
//     }
// }

// public class BFSShortestPath {
//     private static final int nodes = (int)1e5+10;
//     private static int edges;
//     private static ArrayList<Integer>[] adjcl = new ArrayList[nodes];
//     private static int[] visited = new int[nodes];

//     public static void initializedAdjcl() {
//         for (int i = 1; i <= nodes; i++) {
//             adjcl[i] = new ArrayList<>();
//         }
//     }

//     public static void initializedVisited() {
//         for (int i = 1; i <= nodes; i++) {
//             visited[i] = 0;
//         }
//     }

//     private static int getX(String s){
//         return s.charAt(0)-'a';
//     }
//     private static int getY(String s){
//         return s.charAt(1)-'1';
//     }


//     private static void bfs(String source,String destination) {
//         int sourceX = getX(source);
//         int sourceY = getY(source);
//         int destinationX = getX(destination);
//         int destinationY = getY(destination);

//         Queue<<Integer,Integer>> qu = new LinkedList<>();
//         qu.offer(source);
//         while (!qu.isEmpty()) {
//             int node = qu.poll();
//             visited[node] = 1;
//             System.out.print(node + " ");
//             for (int i = 0; i < adjcl[node].size(); i++) {
//                 if(visited[adjcl[node].get(i)]==0){
//                     qu.offer(adjcl[node].get(i));
//                     visited[adjcl[node].get(i)] = 1;
//                 }
//             }
//         }
//     }

//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
        
//         adjcl = new ArrayList[nodes + 1];
//         visited = new int[nodes+1];
//         initializedAdjcl();
//         initializedVisited();

//         int t = in.nextInt();
//         while(t-->0){
//             String s1 = in.next();
//             String s2 = in.next();
//             bfs(s1,s2);
//         }


//     }
// }
