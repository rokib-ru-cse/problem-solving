package others;

import java.io.*;
import java.util.*;

public class KMessedArraySort {

  static int[] sortKMessedArray(int[] arr, int k) {
     for (int i = 0; i < arr.length; i++) {
            int first_Index = i-k<0?0:i-k;
            int last_Index = i+k>arr.length-1?arr.length-1:i+k;
            for (int j = first_Index; j < last_Index; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]= temp;
                }
            }
            
        }
        return arr; 
      
  }

  public static void main(String[] args) {
    for (int a : sortKMessedArray(new int[]{1,2,4,3,7,6,5},2)) {
        System.out.print(a+" ");
    }
  }

}