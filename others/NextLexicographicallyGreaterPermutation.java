package others;

import java.lang.reflect.Array;
import java.util.Arrays;

public class NextLexicographicallyGreaterPermutation {
    
    static int[] nextLexicographicallyGreaterPermutation(int[] arr){
        for(int i=arr.length-1;i>0;i--){
            if(arr[i-1]<arr[i]){
                int temp = arr[i-1];
                arr[i-1] = arr[i];
                arr[i]=temp;
                return arr;
            }
        }
         Arrays.sort(arr);
         return arr;
    }
    public static void main(String[] args) {
        for (int a : nextLexicographicallyGreaterPermutation(new int[]{3,2,1})) {
            System.out.print(a+" ");
        }
    }
}
