package leetcode;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CountandSay_38 {

    public static String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        String res = "";
        String currentString = "1";
        for (int i = 1; i < n; i++) {
            char key = currentString.charAt(0);
            int val = 1;
            res = "";
            currentString += '$';
            for (int j = 1; j < currentString.length(); j++) {
                if (key == currentString.charAt(j)) {
                    val++;
                } else {
                    res += val;
                    res += key;
                    key = currentString.charAt(j);
                    val = 1;
                }
            }
            currentString = res;
        }
        return res;
    }

    public static String countAndSay1(int n) {
        if (n == 1) {
            return "1";
        }

        String currentString = countAndSay1(n - 1);
        char key = currentString.charAt(0);
        int val = 1;
        String res = "";
        currentString += '$';
        for (int j = 1; j < currentString.length(); j++) {
            if (key == currentString.charAt(j)) {
                val++;
            } else {
                res += val;
                res += key;
                key = currentString.charAt(j);
                val = 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(countAndSay(5));
        System.out.println(countAndSay1(5));
    }
}
