package others;

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
        int previousSum=arr[0];
        
        int lastIndex = 1;
        int max = -1000;
        while (lastIndex<arr.length) {
            int k=lastIndex;
            int postSum=arr[lastIndex-1];
            while(true ){
                if(k<arr.length && postSum+arr[k]>=previousSum   ){
                    postSum = postSum+arr[k];
                    max = Math.max(postSum, max);
                    //System.out.println("previous "+previousSum+" postsum "+postSum+" lastIndex "+lastIndex+" k "+k);
                    k++;
                }else{
                    //System.out.println("previous "+previousSum+" postsum "+postSum+" lastIndex "+lastIndex+" k "+k);
                    previousSum=max;
                    postSum = 0;
                    break;
                }
            }
            lastIndex++;
            
        }
        return max;
    }


    public static void main(String[] args) {
        System.out.println(maximumSubarraySum(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
}