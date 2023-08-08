package others;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

/**
 * SetMatrixZero
 */
public class SetMatrixZero {

   static class Pair{
        int x;
        int y;
        Pair(){

        }
        Pair(int a,int b){
            x=a;
            y=b;
        }
    }

    public static int[][] setMatrixZero(int[][] arr){
        //Map<Integer,Integer> map = new HashMap<>();
        // time : O(N*M)
        List<Pair> list = new ArrayList<Pair>();
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==0){
                    list.add(new Pair(i, j));
                }
            }
        }
        //System.out.println(list);
        for (Pair p : list) {
            int i = p.x;
            int j = p.y;
            for (int k = 0; k < arr[i].length; k++) {
                arr[i][k] = 0;
            }
            for (int k = 0; k < arr.length; k++) {
                arr[k][j] = 0;
            }
        }
        return arr;
    }

    public static void main(String[] args){
        // for (int[] a : setMatrixZero(new int[][] {{1,1,1},{1,0,1},{1,1,1}})) {
        //     for (int b : a) {
        //         System.out.print(b+" ");
        //     }
        //     System.out.println();
        // }
        for (int[] a : setMatrixZero(new int[][] {{0,1,2,0},{3,4,5,2},{1,3,1,5}})) {
            for (int b : a) {
                System.out.print(b+" ");
            }
            System.out.println();
        }
    }

}