package Array;

public class LargestNumberInAnArray {
    
    public static int largestNumberInAnArray(int[] arr){
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
        System.out.println(largestNumberInAnArray(new int[]{1,3,7,12,9,123,44,55}));
    }
}
