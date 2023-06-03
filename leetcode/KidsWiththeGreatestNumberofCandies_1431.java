package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidsWiththeGreatestNumberofCandies_1431 {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        int max = -1;
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }
        List<Boolean> res = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            if (candies[i]+extraCandies >= max) {
                res.add(true);
            }else{
                res.add(false);
            }
        }
        return res;
    }

    public static void main(String[] args) {

    }
}
