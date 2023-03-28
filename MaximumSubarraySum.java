/**
 * MaximumSubarraySum
 */
public class MaximumSubarraySum {

    static int maximumSubarraySum(int[] arr){

        /*
         [-2,1,-3,4,-1,2,1,-5,4] 
         return 6
        -3+4 = 1
        -1-3 = -4
        */
        int previousSum=-1111111;
        int postSum=arr[0];
        int lastIndex = 0;
        while (lastIndex<arr.length) {
            int k=lastIndex;
            while(true ){
                if(k<arr.length && postSum+arr[k]>=postSum){
                    postSum = postSum+arr[k];
                    k++;
                }else{
                    if(postSum>=previousSum){
                        previousSum=postSum;
                    }
                    postSum = 0;
                    break;
                }
            }
            lastIndex++;
            
        }
        return previousSum;
    }


    public static void main(String[] args) {
        System.out.println(maximumSubarraySum(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
}