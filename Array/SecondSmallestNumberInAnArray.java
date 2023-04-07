package Array;

/**
 * SecondSmallestNumberInAnArray
 */
public class SecondSmallestNumberInAnArray {
    public static int secondSmallestNumberInAnArray(int[] arr){
        
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i; j < arr.length; j++) {
                if(arr[j]<arr[i]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        return arr[1];
    }

    
    public static void main(String[] args) {
        System.out.println(secondSmallestNumberInAnArray(new int[]{1,3,7,12,9,123,44,55}));
    }
}