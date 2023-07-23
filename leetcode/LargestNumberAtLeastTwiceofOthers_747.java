package leetcode;

public class LargestNumberAtLeastTwiceofOthers_747 {
    public static int dominantIndex(int[] nums) {
        int max = -1;
        int maxIndex = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                maxIndex = i;
            }
        }
        for (int val : nums) {
            if (val != max && val * 2 > max) {
                return -1;
            }
        }
        return maxIndex;
    }

    public static void main(String[] args) {
        System.out.println(dominantIndex(new int[]{3, 6, 1, 0}));
    }
}
