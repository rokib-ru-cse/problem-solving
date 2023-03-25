import java.io.*;
import java.util.*;

class PascalTriangle {
  
  static int[][] pascalTringle(int num) {
    if(num==1){
        return new int[][]{{1}};
    }
    return new int[][]{{0}};
  }

  public static void main(String[] args) {
    for(int[] a:pascalTringle(1)){
        for(int b:a){
            System.out.println(b+" ");
        }
    }
  }

}