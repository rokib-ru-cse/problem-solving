import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class RemoveLetterToEqualizeFrequency {
    public boolean equalFrequency(String word) {
        Map<Character, Integer> m = new HashMap<>();
        for (char c : word.toCharArray()) {
            if (m.containsKey(c)) {
                m.put(c, m.get(c) + 1);
            } else {
                m.put(c, 1);
            }
        }
        Map<Integer, Integer> mm = new HashMap<>();
        for (Map.Entry en : m.entrySet()) {
            if (mm.containsKey(en.getValue())) {
                mm.put((Integer) en.getValue(), mm.get(en.getValue()) + 1);
            } else {
                mm.put((Integer) en.getValue(), 1);
            }
        }
        int mx = Collections.max(m.entrySet(), Map.Entry.comparingByValue()).getValue();
        int max = Collections.max(mm.entrySet(), Map.Entry.comparingByValue()).getValue();
        int min = Collections.min(mm.entrySet(), Map.Entry.comparingByValue()).getValue();
        return mx == 1 ? true : (mm.size()==2&& max==min)?true: max - min == 1 ? true : false;
    }

    public static void main(String[] args) {
        System.out.println(new RemoveLetterToEqualizeFrequency().equalFrequency("ddaccb"));
    }
}
