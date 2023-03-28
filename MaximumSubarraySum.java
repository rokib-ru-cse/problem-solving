/**
 * MaximumSubarraySum
 */
public class MaximumSubarraySum {

    static int maximumSubarraySum(int[] arr){

        /*
         [-2,1,-3,4,-1,2,1,-5,4] 
         return 6
        
        */
        int previousSum=0;
        int postSum=0;
        int lastIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k=lastIndex; k < j; k++) {
                    post+=arr[k];
                }
                
            }
        }

        return 0;
    }


    public static void main(String[] args) {
        
    }
}