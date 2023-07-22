package practice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Test {

    public static int[] s(int [] array){
        int n = array.length;
        int[] sortedSquaredArray = new int[n];
        int left = 0;
        int right = n - 1;
        int index = n - 1;

        while (left <= right) {
            if (Math.abs(array[left]) > Math.abs(array[right])) {
                sortedSquaredArray[index] = array[left] * array[left];
                left++;
            } else {
                sortedSquaredArray[index] = array[right] * array[right];
                right--;
            }
            index--;
        }

        return sortedSquaredArray;
    }

    public static void main(String[] args) {
        for (int a:
             s(new int[]{-5,-1,0,3,10})) {
            System.out.print(a+" ");
        }


    }
}
