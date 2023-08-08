package others;

import java.io.*;
import java.util.*;

class PascalTriangle {
  
  static int[][] pascalTringle(int num) {
    if(num==1){
        return new int[][]{{1}};
    }
    int[][] res = new int[num][];
    res[0] = new int[]{1};
    for(int i=1;i<num;i++){
      int[] temp = new int[i+1];
      for(int j=0;j<=i;j++){
        if(j==0||j==i){
          temp[j] = 1;
        }else{
          temp[j] = res[i-1][j-1]+res[i-1][j];
        }
      }
      res[i] = temp;
    }
    return res;
  }

  public static void main(String[] args) {
    for(int[] a:pascalTringle(5)){
        for(int b:a){
            System.out.print(b+" ");
        }
        System.out.println();
    }
  }

}