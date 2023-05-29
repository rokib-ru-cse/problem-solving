import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;

/**
 * RemoveDuplicateCharacters
 */
public class RemoveDuplicateCharacters {

    public String removeDuplicateCharByDistinct(String s) {
        StringBuilder sb = new StringBuilder();
        s.chars().distinct().forEach(c->sb.append((char)c));
        return sb.toString();
    }

    public String removeDuplicateCharLoop(String s) {
        String sb = new String();
        for (char c : s.toCharArray()) {
            if (!sb.contains(c + "")) {
                sb += c;
            }
        }
        return sb;
    }

    public String removeDuplicateCharHashMap(String s) {
        Map<Character, Integer> m = new HashMap<Character, Integer>();
        String sb = new String();
        for (char c : s.toCharArray()) {
            if (m.containsKey(c)) {
                m.put(c, m.get(c) + 1);
            } else {
                m.put(c, 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : m.entrySet()) {
            sb += entry.getKey();
        }
        return sb;
    }

    public String removeDuplicateCharHashSet(String s) {
        Set<Character> m = new HashSet<Character>();

        for (char c : s.toCharArray()) {
            m.add(c);
        }
        return m.stream().collect(Collector.of(StringBuilder::new, StringBuilder::append, StringBuilder::append,
                StringBuilder::toString));
    }

    public static void main(String[] args) {
        System.out.println(new RemoveDuplicateCharacters().removeDuplicateCharByDistinct("aa"));
        System.out.println(new RemoveDuplicateCharacters().removeDuplicateCharLoop("aaabbcd"));
        System.out.println(new RemoveDuplicateCharacters().removeDuplicateCharHashMap("aaabbcd"));
        System.out.println(new RemoveDuplicateCharacters().removeDuplicateCharHashSet("aaabbcd"));
    }
}