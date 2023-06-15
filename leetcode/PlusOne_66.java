package leetcode;

import java.lang.reflect.Array;

public class PlusOne_66 {

    public static int[] plusOne(int[] digits) {
        int i = digits.length - 1;
        int extra = 1;
        while (i >= 0) {
            if (digits[i] + extra == 10) {
                digits[i] = 0;
            } else {
                digits[i] = digits[i] + extra;
                extra = 0;
            }
            i--;
        }
        if (extra == 1) {
            int[] newArray = new int[digits.length + 1];
            newArray[0] = 1;
            System.arraycopy(digits, 0, newArray, 1, digits.length);
            return newArray;
        } else {
            return digits;
        }
    }

    public static void main(String[] args) {
        for (int i :
                plusOne(new int[]{8, 9, 9, 9})) {
            System.out.print(i + " ");
        }
    }
}
