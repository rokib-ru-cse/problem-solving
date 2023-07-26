package string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ValidShuffle {


    public static boolean isValidShuffle1(String first, String second, String result) {
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        for (int i = 0; i < result.length(); i++) {
            if (i < first.length()) {
                if (map1.containsKey(first.charAt(i))) {
                    map1.put(first.charAt(i), map1.get(first.charAt(i)) + 1);
                } else {
                    map1.put(first.charAt(i), 1);
                }
            }
            if (i < second.length()) {
                if (map1.containsKey(second.charAt(i))) {
                    map1.put(second.charAt(i), map1.get(second.charAt(i)) + 1);
                } else {
                    map1.put(second.charAt(i), 1);
                }
            }
            if (map2.containsKey(result.charAt(i))) {
                map2.put(result.charAt(i), map2.get(result.charAt(i)) + 1);
            } else {
                map2.put(result.charAt(i), 1);
            }
        }
        return map1.equals(map2);
    }

    public static boolean isValidShuffle2(String first, String second, String result) {
        int j = 0;
        int k = 0;
        first = sortString(first);
        second = sortString(second);
        result = sortString(result);
        for (int i = 0; i < result.length(); i++) {
            if (j < first.length() && first.charAt(j) == result.charAt(i)) {
                j++;
            } else if (k < second.length() && second.charAt(k) == result.charAt(i)) {
                k++;
            } else {
                return false;
            }
        }
        return true;
    }

    private static String sortString(String data) {
        char[] res = data.toCharArray();
        Arrays.sort(res);
        return new String(res);
    }

    public static void main(String[] args) {
        String first = "XY";
        String second = "21";
        String result = "1XY2";
        System.out.println(isValidShuffle1(first, second, result));
        System.out.println(isValidShuffle2(first, second, result));
    }
}
