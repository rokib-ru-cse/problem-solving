import java.util.HashMap;
import java.util.Map;

public class MakeTwoStringsAnagram {
    
    public static int minSteps(String s, String t) {
        int cnt=0;
        for(char c:s.toCharArray()){
            if(t.contains(c+"")){
                t = t.substring(t.indexOf(c+""), t.length());
            }else{
                cnt++;
            }
        }

        return cnt;
    }
    public static int minSteps1(String s, String t) {
        int cnt=0;
        Map<Character, Integer> smap = new HashMap<>();
        Map<Character, Integer> tmap = new HashMap<>();
        for(char c:s.toCharArray()){
            if(smap.containsKey(c)){
                smap.put(c,smap.get(c)+1);
            }else{
                smap.put(c,1);
            }
        }
        for(char c:t.toCharArray()){
            if(tmap.containsKey(c)){
                tmap.put(c,tmap.get(c)+1);
            }else{
                tmap.put(c,1);
            }
        }
        System.out.println(smap);
        System.out.println(tmap);

        for (Map.Entry<Character,Integer> e:smap.entrySet()){
            if(tmap.containsKey(e.getKey())){
                cnt+= Math.abs(e.getValue()-tmap.get(e.getKey()));
            }else{
                cnt+=e.getValue();
            }
        }
        return cnt;
    }
// 1+1+2+
    public static void main(String[] args) {
      // System.out.println(minSteps("anagram","mangaar"));
       System.out.println(minSteps1("leetcode","practice"));

    }
}
