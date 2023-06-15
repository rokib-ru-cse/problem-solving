package leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum_1 {

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        System.out.println(map);
        for (int i = 0; i < nums.length; i++) {
            int findings = target - nums[i];
            if (map.containsKey(findings) && i != map.get(findings)) {
//                int[] res = new int[]{i,map.get(findings)};
//                System.out.println(res[0]+" "+res[1]);
                return new int[]{i, map.get(findings)};
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {
        twoSum(new int[]{3, 2, 4}, 6);
    }
}
