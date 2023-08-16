package string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindDuplicateCharactersInString {

    public static Map<Character,Integer> findDuplicateCharactersInString1(String data){
        Map<Character,Integer> map = new HashMap<>();
        Map<Character,Integer> res = new HashMap<>();
        for (char c:data.toCharArray()) {
            if (map.containsKey(c)){
                res.put(c,map.get(c)+1);
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }
        return res;
    }
    public static Map<Character,Integer> findDuplicateCharactersInString2(String data){
        Map<Character,Integer> res = new HashMap<>();
        int[] chars = new int[26];
        for (char c:data.toCharArray()) {
            chars[c-'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (chars[i]>1){
                res.put((char)(i+97),chars[i]);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(findDuplicateCharactersInString1("ababcdd"));
        System.out.println(findDuplicateCharactersInString2("ababcdd"));
    }
}
