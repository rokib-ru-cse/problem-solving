import java.util.HashMap;
import java.util.Map;

public class TwoStringsAreAnagramsOrNot {

    public boolean twoStringsAreAnagramsOrNot(String str1, String str2) {

        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        for (char c : str1.toCharArray()) {
            if (map1.containsKey(c)) {
                map1.put(c, map1.get(c) + 1);
            } else {
                map1.put(c, 1);
            }
        }
        for (char c : str2.toCharArray()) {
            if (map2.containsKey(c)) {
                map2.put(c, map2.get(c) + 1);
            } else {
                map2.put(c, 1);
            }
        }

        for (Map.Entry<Character, Integer> ent : map1.entrySet()) {
            if (ent.getValue() != map2.get(ent.getKey())) {
                return false;
            }
        }

        return true;
    }
    public boolean twoStringsAreAnagramsOrNotByCharArray(String str1, String str2) {

        int[] count = new int[256];

        for (int i = 0; i < str1.length(); i++) {
            count[str1.charAt(i)]++;
            count[str2.charAt(i)]--;
        }

        for (int i : count) {
            if(i!=0){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(new TwoStringsAreAnagramsOrNot().twoStringsAreAnagramsOrNot("race", "care"));
        System.out.println(new TwoStringsAreAnagramsOrNot().twoStringsAreAnagramsOrNotByCharArray("race", "care"));
    }
}
