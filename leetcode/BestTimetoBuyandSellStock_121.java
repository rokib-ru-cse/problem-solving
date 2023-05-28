package leetcode;

import java.util.Arrays;
import java.util.Collections;

public class BestTimetoBuyandSellStock_121 {
    public static int maxProfit(int[] prices) {
        int max = 0;
        int l = 0;
        int r = 1;
        while (r < prices.length) {
            if (prices[l] > prices[r]) {
                l = r;
            } else if (prices[r] - prices[l] > max) {
                max = prices[r] - prices[l];
            }
            r++;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }
}
