package others;

import java.util.HashMap;
import java.util.Map;

public class ReplaceChar {

    public String replaceChar(String s) {

        Map<Character, Integer> m = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (m.containsKey(c)) {
                m.put(c, m.get(c) + 1);
            } else {
                m.put(c, 1);
            }
        }
        String ss = new String();
        for (char c : s.toCharArray()) {
            ss = ss + m.get(c);
        }
        return ss;
    }

    public String replaceCharByFilter(String s) {

        String ss = new String();
        for (char c : s.toCharArray()) {
            ss = ss + s.chars().filter(ch -> ch == c).count();
        }
        return ss;
    }

    public String replaceCharByCodePointCount(String s) {

        String ss = new String();
        for (char c : s.toCharArray()) {
            ss = ss + (s.codePointCount(0, s.length()) - s.replaceAll(c + "", "").length());
        }
        return ss;
    }

    public String replaceSpecificChar(String s) {

        String ss = new String();
        StringBuilder sb = new StringBuilder(s);
        int cnt = 0;
        char ch = 'a';

        if(s.indexOf('a')==-1){
            // System.out.println("return from if");
            return s;
        }

        for (int i = 0; i < s.length(); i++) {
            if (ch == s.charAt(i)) {
                cnt++;
                char a = (char)(cnt+'0');
                sb.setCharAt(i, a);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(new ReplaceChar().replaceChar("aadddccc"));
        System.out.println(new ReplaceChar().replaceCharByFilter("aadddccc"));
        System.out.println(new ReplaceChar().replaceCharByCodePointCount("aadddccc"));
        System.out.println(new ReplaceChar().replaceSpecificChar("dddccc"));
    }
}
