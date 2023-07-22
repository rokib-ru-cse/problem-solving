package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NumberofStringsThatAppearasSubstringsinWord_1967 {
    public static int numOfStringsW(String[] patterns, String word) {
        Set<String> substring = new HashSet<>();
        for (int i = 0; i < word.length(); i++) {
            for (int j = i; j < word.length(); j++) {
                substring.add(word.substring(i,j+1));
            }
        }
        int cnt=0;
        for (String s: patterns
             ) {
            for (String sub: substring
                 ) {
                if (s.equals(sub)){
                    cnt++;
                }
            }
        }
        return cnt;
    }
    public static int numOfStrings(String[] patterns, String word) {
        int cnt=0;
        for (String s: patterns
        ) {
            if(word.contains(s)){
                cnt++;
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        System.out.println(numOfStrings(new String[]{"a","abc","bc","d"},"abc"));
    }
}
