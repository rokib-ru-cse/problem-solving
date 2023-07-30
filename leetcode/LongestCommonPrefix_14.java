package leetcode;

public class LongestCommonPrefix_14 {
    public static String longestCommonPrefix(String[] strs) {
        String res = "";
        int i = 0;
        for (char c : strs[0].toCharArray()) {
            res += c;
            for (int j = 1; j < strs.length; j++) {
                 if (i >= strs[j].length() || c != strs[j].charAt(i)) {
                   return res.substring(0,i);
                }
            }
            i++;
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
    }
}
