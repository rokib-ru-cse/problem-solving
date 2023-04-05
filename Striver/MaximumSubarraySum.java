public class MaximumSubarraySum{

static int maximumSubarraySum(int[] arr){
    int lastSum=Integer.MIN_VALUE;
    int currentSum=0;
    int lastIndex=0;

    int lastMax=Integer.MIN_VALUE;
    int i=0;
    while (lastIndex<arr.length) {
        if(i<arr.length){
            currentSum+=arr[i++];
        }
        if(currentSum>=lastMax || currentSum>=lastSum){
            lastSum=currentSum;
        }else{
            lastMax = lastSum;
            lastSum = 0;
            currentSum=0;
            lastIndex++;
            i=lastIndex;
        }
    }
    return lastMax;
}

    public static void main(String[] args) {
        System.out.println(maximumSubarraySum(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
}