package leetcode;

import java.util.Arrays;

public class IncreasingDecreasingString_1370 {

    public static String sortString(String s) {

        int[] ch = new int[26];

        for (char c : s.toCharArray()) {
            ch[c - 97]++;
        }
        StringBuilder res = new StringBuilder();
        while (Arrays.stream(ch).anyMatch(c -> c > 0)) {
            for (int i = 0; i < 26; i++) {
                if (ch[i] > 0) {
                    res.append((char) (i + 97));
                    ch[i]--;
                }
            }
            for (int i = 25; i >= 0; i--) {
                if (ch[i] > 0) {
                    res.append((char) (i + 97));
                    ch[i]--;
                }
            }
        }

        return res.toString();
    }

    public static void main(String[] args) {
        System.out.println(sortString("aaabbbccc"));
    }
}
