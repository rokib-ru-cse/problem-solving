package others;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountTheOccurrenceOfAGivenCharacter {

    private static int countTheOccurrenceOfAGivenCharacter1(String str, char c) {
        int[] charFreq = new int[26];
        for (char ch : str.toCharArray()) {
            charFreq[ch - 'a']++;
        }
        return charFreq[c - 'a'];
    }

    private static int countTheOccurrenceOfAGivenCharacter2(String str, char c) {
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        return map.get(c);
    }

    private static int countTheOccurrenceOfAGivenCharacter3(String str, char c) {
        int res = 0;
        for (char ch : str.toCharArray()) {
            if (ch == c) {
                res++;
            }
        }
        return res;
    }

    private static int countTheOccurrenceOfAGivenCharacter4(String str, char c) {
        return (int) str.chars().filter(ch -> ch == c).count();
    }

    private static int countTheOccurrenceOfAGivenCharacter5(String str, char c) {
        return (int) str.codePoints().filter(ch -> ch == c).count();
    }

    private static int countTheOccurrenceOfAGivenCharacter6(String str, char c) {
        Pattern pattern = Pattern.compile(String.valueOf(c));
        Matcher matcher = pattern.matcher(str);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countTheOccurrenceOfAGivenCharacter1("abca", 'a'));
        System.out.println(countTheOccurrenceOfAGivenCharacter2("abca", 'a'));
        System.out.println(countTheOccurrenceOfAGivenCharacter3("abca", 'a'));
        System.out.println(countTheOccurrenceOfAGivenCharacter4("abca", 'a'));
        System.out.println(countTheOccurrenceOfAGivenCharacter5("abca", 'a'));
        System.out.println(countTheOccurrenceOfAGivenCharacter6("abca", 'a'));
    }
}
