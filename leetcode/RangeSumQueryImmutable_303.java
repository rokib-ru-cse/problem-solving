package leetcode;

public class RangeSumQueryImmutable_303 {

    int[] nums;

    public RangeSumQueryImmutable_303(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i - 1] + nums[i];
        }
        this.nums = nums;
    }

    public int sumRange(int left, int right) {
        if (left == 0) {
            return nums[right];
        }
        return nums[right] - nums[left];
    }

    public static void main(String[] args) {

    }
}
