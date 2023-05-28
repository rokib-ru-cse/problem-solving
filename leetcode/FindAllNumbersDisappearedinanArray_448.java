package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAllNumbersDisappearedinanArray_448 {

    public static List<Integer> findDisappearedNumbersMap(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        List<Integer> res = new ArrayList<>();
        for (int i = 1; i <= nums.length; i++) {
            if (!map.containsKey(i)) {
                res.add(i);
            }
        }
        return res;
    }

    /*
     * 2 3 1
     * num[i-1] = -num[i-1] = 1
     * */
    public static List<Integer> findDisappearedNumbers(int[] numsa) {

        int[] nums = numsa;

        for (int i = 0; i < nums.length; i++) {
            nums[Math.abs(nums[i]) - 1] = -Math.abs(nums[Math.abs(nums[i]) - 1]);
        }
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                res.add(i + 1);
            }
        }
        for (int i = 0; i < res.size(); i++) {
            System.out.print(res.get(i) + " ");
        }
        System.out.println();
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        for (int a : findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1})) {
            System.out.print(a + " ");
        }
    }
}
