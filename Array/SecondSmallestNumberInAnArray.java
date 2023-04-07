package Array;

/**
 * SecondSmallestNumberInAnArray
 */
public class SecondSmallestNumberInAnArray {
    public static int secondSmallestNumberInAnArray(int[] arr){
        int max = Integer.MIN_VALUE;
        int i=0;
        while(i<arr.length){
            if(arr[i]>max){
                max = arr[i];
            }
            i++;
        }

        return max;
    }

    
    public static void main(String[] args) {
        System.out.println(secondSmallestNumberInAnArray(new int[]{1,3,7,12,9,123,44,55}));
    }
}