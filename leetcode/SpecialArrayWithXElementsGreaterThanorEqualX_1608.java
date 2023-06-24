package leetcode;

public class SpecialArrayWithXElementsGreaterThanorEqualX_1608 {


    public int specialArray(int[] nums) {
        // t - n^2 , s - 1
        for (int i=1; i <= nums.length; i++) {
            int cnt = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j]>=i){
                    cnt++;
                }
            }
            if(cnt==i){
                return cnt;
            }
        }

        return -1;
    }

    public int specialArrayX(int[] nums) {
        // t - n , s - n
        int x = nums.length;
        int[] counts = new int[x+1];

        for(int elem : nums)
            if(elem >= x)
                counts[x]++;
            else
                counts[elem]++;

        int res = 0;
        for(int i = counts.length-1; i > 0; i--) {
            res += counts[i];
            if(res == i)
                return i;
        }

        return -1;
    }

    public static void main(String[] args) {

    }
}
