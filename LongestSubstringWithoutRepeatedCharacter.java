import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LongestSubstringWithoutRepeatedCharacter {

    public String longestSubstringWithoutRepeatedCharacter(String s) {
        Set<String> ss = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (sb.indexOf(s.charAt(i) + "") == -1) {
                sb.append(s.charAt(i));
            } else {
                i = s.substring(0, i).lastIndexOf(s.charAt(i));
                // i--;
                ss.add(sb.toString());
                sb = new StringBuilder();
            }
        }
        if (sb.length() > 0) {
            ss.add(sb.toString());
        }
        // System.out.println(ss);
        return ss.stream()
                .max(Comparator.comparingInt(String::length)).orElse(null);

    }

    public int longestSubstringWithoutRepeatedCharacterMaxLength(String s) {
        Set<String> ss = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (sb.indexOf(s.charAt(i) + "") == -1) {
                sb.append(s.charAt(i));
            } else {
                i = s.substring(0, i).lastIndexOf(s.charAt(i));
                // i--;
                ss.add(sb.toString());
                sb = new StringBuilder();
            }
        }
        if (sb.length() > 0) {
            ss.add(sb.toString());
        }
        // System.out.println(ss);
        return ss.stream()
                .mapToInt(String::length)
                .max()
                .orElse(0);

    }

    public int longestSubstringWithoutRepeatedCharacterHashMap(String s) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        
        String ss = new String();
        int size = 0;
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), i);
            } else {
                // System.out.println(map);
                i = map.get(s.charAt(i));
                // i--;
                map.clear();
            }
            if (map.size() > size) {
                StringBuilder sb = new StringBuilder();
                map.keySet().stream().forEach(c -> sb.append(c));
                ss = sb.toString();
                size = map.size();
            }
        }
        return ss.length();
    }

    public static void main(String[] args) {
        System.out.println(new LongestSubstringWithoutRepeatedCharacter()
                .longestSubstringWithoutRepeatedCharacter("abcabcbb"));
        System.out.println(new LongestSubstringWithoutRepeatedCharacter()
                .longestSubstringWithoutRepeatedCharacterMaxLength("abcabcbb"));
        System.out.println(new LongestSubstringWithoutRepeatedCharacter()
                .longestSubstringWithoutRepeatedCharacterHashMap("abcabcbb"));
    }
}
