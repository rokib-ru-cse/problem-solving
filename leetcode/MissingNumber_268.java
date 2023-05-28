package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MissingNumber_268 {

    public static int missingNumber(int[] nums) {
        int max = -1;

        List<Integer> temp = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        if (max < nums.length) {
            max = nums.length;
        }
        int[] tempa = new int[max + 1];
        for (int i = 0; i < nums.length; i++) {
            tempa[nums[i]] = nums[i];
        }
        for (int i = 0; i < max + 1; i++) {
            if (tempa[i] != i) {
                return i;
            }
        }
        return 0;
    }

    public static int missingNumberSort(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                return i;
            }
        }
        if (nums.length - 1 == nums[nums.length - 1]) {
            return nums.length;
        }
        return 0;
    }

    public static int missingNumberSum(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        int len = nums.length;
        return (len * (len + 1)) / 2 - sum;
    }

    public static int missingNumberXor(int[] nums) {
        int a = 0, i = 0;
        for (i = 0; i < nums.length; i++) {
            a = nums[i] ^ i ^ a;
        }
        return a ^ i;
    }

    public static void main(String[] args) {
        System.out.println(missingNumberXor(new int[]{0, 1}));
    }
}
