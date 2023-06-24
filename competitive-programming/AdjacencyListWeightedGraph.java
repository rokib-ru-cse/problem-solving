// import java.util.*;

// /**
//  * AdjacencyListWeightedGraph
//  */
// // class Pair<U,V> {
// //     public final U first;
// //     public final V second;

// //     Pair(U v1, V v2) {
// //         this.first = v1;
// //         this.second = v2;
// //     }

// //     public String toString() {
// //         return this.first+" "+ this.second;
// //     }
// //     public U first(){
// //         return this.first;
// //     }
// //     public V second(){
// //         return this.second;
// //     }
// // }

// public class AdjacencyListWeightedGraph {
//     private static int nodes;
//     private static int edges;
//     private static ArrayList<Pair<Integer,Integer>>[] adjclwg;

//     private static void initializedAdjcl() {
//         for (int i = 1; i <= nodes; i++) {
//             adjclwg[i] = new ArrayList<>();
//         }
//     }

//     private static void getGraphInput() {
//         Scanner in = new Scanner(System.in);
//         int x, y, w;
//         for (int i = 0; i < edges; i++) {
//             x = in.nextInt();
//             y = in.nextInt();
//             w = in.nextInt();
//             adjclwg[x].add(new Pair(y, w));
//             adjclwg[y].add(new Pair(x, w));
//         }
//     }

//     private static void printGraph() {
//         for (int i = 1; i <=nodes; i++) {
//             System.out.print(i+" => ");
//             for (int j = 0; j < adjclwg[i].size(); j++) {
//                 System.out.print(adjclwg[i].get(j).second()+" ");
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         nodes = in.nextInt();
//         edges = in.nextInt();
//         adjclwg = new ArrayList[nodes + 1];
//         initializedAdjcl();
//         getGraphInput();
//         printGraph();
//     }

// }