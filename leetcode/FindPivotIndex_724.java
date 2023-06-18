package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindPivotIndex_724 {


    /*public int pivotIndex(int[] nums) {
        int[] leftSum = new int[nums.length];
        int[] rightSum = new int[nums.length];
                leftSum[0]  = nums[0];
                rightSum[rightSum.length-1]  = nums[rightSum.length-1];
        for(int i=1;i<nums.length;i++){
            leftSum[i] = leftSum[i-1] + nums[i]
            rightSum[nums.length-i-1] = rightSum[nums.length-i] + nums[nums.length-i-1];
        }
        for(int i=0;i<nums.length;i++){
                    if(leftSum[i]==rightSum[i]){
                        return i;
                    }
                }
        return -1;
    }
*/

public static int pivotIndex(int[] nums) {
        int leftSum = nums[0];  
        int rightSum = nums[nums.length-1];
                int i=1;
                int j=nums.length-2;
        for(;i<nums.length && j>=0;){
            if(leftSum==rightSum){
                return i;
            }
            if(leftSum<rightSum){
                leftSum += nums[i++] ;
            }else{
                rightSum += nums[j--];
            }
        }
        return -1;    
    }
    public static void main(String[] args) {
        System.out.println(pivotIndex(new int[]{1,7,3,6,5,6}));
    }
}
