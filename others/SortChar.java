package others;

import java.util.Arrays;

/**
 * SortChar
 */
public class SortChar {

    public String sortString(String s){
        char[] a = s.toCharArray();  
        Arrays.sort(a);
        return new String(a);
    }
    public String sortStringByChars(String s){
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < sb.length(); i++) {
            for (int j = 0; j < sb.length()-(i+1); j++) {
                if(sb.charAt(j)>sb.charAt(j+1)){
                    char c = sb.charAt(j);
                    sb.setCharAt(j,sb.charAt(j+1));
                    sb.setCharAt(j+1,c);
                }
            }
        }
        return sb.toString();
    }



    public static void main(String[] args) {
        System.out.println(new SortChar().sortString("acb"));
        System.out.println(new SortChar().sortStringByChars("fdsabvcxz"));
    }
}