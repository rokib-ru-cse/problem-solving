package leetcode;

import java.util.ArrayList;
import java.util.List;

public class SumofAllSubsetXORTotals_1863 {

    public static int subsetXORSum(int[] nums) {
        for (List<Integer> list:
             allSubSets(nums)) {
            for (Integer a:
                list ){
                System.out.print(a+" ");
            }
            System.out.println();
        }
        return 0;
    }

    static List<List<Integer>>  allSubSets(int nums[]) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            List<Integer> subset = new ArrayList<>();
            for (int j = 0; j <=i; j++) {
                for (int k = j; k <= j; k++) {
                    subset.add(nums[k]);
                }
            }
            res.add(subset);
        }
        return res;
    }

    public static void main(String[] args) {
        subsetXORSum(new int[]{1,2});
    }
}


/*
*
*  1 2 3
*  1
*  1 2
*  1 2 3
*
*
*
*
* */
