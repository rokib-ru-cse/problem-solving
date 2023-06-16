package leetcode;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesfromSortedArray_26 {

    public static int removeDuplicates(int[] nums) {
        int c = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[c] = nums[i];
                c++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        return c;
    }


    public static void main(String[] args) {
        System.out.println();
        System.out.println(removeDuplicates(new int[]{1, 1, 2}));
    }
}
