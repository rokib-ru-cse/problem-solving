package leetcode;

public class MergeStringsAlternately_1768 {

    public static String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int i =0;
        int j =0;
        while (i<word1.length() && j<word2.length()){
            sb.append(word1.charAt(i++));
            sb.append(word2.charAt(j++));
        }
        if (i!=word1.length()){
            sb.append(word1.substring(i));
        }
        if (j!=word2.length()){
            sb.append(word2.substring(j));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(mergeAlternately("abc","pqr"));
        System.out.println(mergeAlternately("ab","pqrs"));
    }
}
