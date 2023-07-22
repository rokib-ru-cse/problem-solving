package leetcode;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class AddtoArrayFormofInteger_989 {
    public static List<Integer> addToArrayForm(int[] num, int k) {
        int i = num.length - 1;
        int carry = 0;
        List<Integer> res = new ArrayList<>();
        while (i >= 0) {
            int a = num[i];
            int b = k % 10;
            if (a + b + carry > 9) {
                res.add((a + b+carry) % 10);
                carry = 1;
            } else {
                res.add((a + b+carry));
                carry = 0;
            }
            k /= 10;
            i--;
        }
        if (carry != 0) {
            res.add(carry);
        }
        Collections.reverse(res);
        return res;
    }

    public static void main(String[] args) {
        for (int a: addToArrayForm(new int[]{2,7,4},181)
             ) {
            System.out.print(a+" ");
        }
    }
}
