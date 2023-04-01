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

    public static void main(String[] args) {
       System.out.println(minSteps("anagram","mangaar"));
        
    }
}
