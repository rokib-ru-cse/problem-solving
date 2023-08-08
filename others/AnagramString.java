package others;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AnagramString {

    private static boolean isAnagramString1(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }

    private static boolean isAnagramString2(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        for (char c : str1.toCharArray()) {
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }
        for (char c : str2.toCharArray()) {
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : map1.entrySet()) {
            if (entry.getValue() != map2.get(entry.getKey())) {
                return false;
            }
        }
        return true;
    }

    private static boolean isAnagramString3(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        Map<Character, Integer> charFreq = new HashMap<>();
        for (char c : str1.toCharArray()) {
            charFreq.put(c, charFreq.getOrDefault(c, 0) + 1);
        }
        for (char c : str2.toCharArray()) {
            if (!charFreq.containsKey(c)) {
                return false;
            }
            charFreq.put(c, charFreq.get(c) - 1);
            if (charFreq.get(c) == 0) {
                charFreq.remove(c);
            }
        }
        return charFreq.isEmpty();
    }

    private static boolean isAnagramString4(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        int[] charCount = new int[26];
        for (char c : str1.toCharArray()) {
            charCount[c - 'a']++;
        }
        for (char c : str2.toCharArray()) {
            charCount[c - 'a']--;
            if (charCount[c - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagramString1("abecmm", "abcemm"));
        System.out.println(isAnagramString2("abecmm", "abcemm"));
        System.out.println(isAnagramString3("abecmm", "abcemm"));
        System.out.println(isAnagramString4("abecmm", "abcemm"));
    }
}
