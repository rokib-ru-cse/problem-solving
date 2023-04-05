public class MaximumSubarraySum{

static int maximumSubarraySum(int[] arr){
    int sum=0;
    int lastSum=Integer.MIN_VALUE;
    int lastIndex=0;

    int max=Integer.MIN_VALUE;
    int i=0;
    while (lastIndex<arr.length) {
        sum+=arr[i++];
        if(sum>=lastSum){
            lastSum=sum;
        }else{
            lastIndex++;
            i=lastIndex;
        }
    }
    return lastSum;
}

    public static void main(String[] args) {
        System.out.println(maximumSubarraySum(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
}