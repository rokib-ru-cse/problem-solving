package string;

public class LongestPalindromeInAString {

    public static String longestPalindromeInAString1(String str) {

        if (str.length() < 2) {
            return str;
        }
        String res = str.substring(0, 1);
        for (int i = str.length() - 1; i >= 1; i--) {
            for (int j = 0; j + i < str.length(); j++) {
                String s = "";
                for (int k = j; k <= i + j; k++) {
                    s += str.charAt(k);
                }
//                System.out.println(s);   got TLE
                if (isPalindrome(s)) {
                    return s;
                }
            }
        }

        return res;
    }

    private static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }


    public static String longestPalindromeInAString2(String str) {

        if (str.length() < 2) {
            return str;
        }
        String res = str.substring(0, 1);
        for (int i = str.length() - 1; i >= 1; i--) {
            for (int j = 0; j + i < str.length(); j++) {
                StringBuilder s = new StringBuilder("");
                for (int k = j; k <= i + j; k++) {
                    s.append(str.charAt(k));
                }
                StringBuilder sb = new StringBuilder(s);
                if (s.compareTo(sb.reverse()) == 0) {
                    return s.toString();
                }
            }
        }

        return res;
    }
    public static String longestPalindromeInAString3(String str) {

        if (str.length() < 2) {
            return str;
        }
        String res = "";
        for (int i = str.length() - 1; i >= 1; i--) {
            for (int j = 0; j + i < str.length(); j++) {
                StringBuilder s = new StringBuilder("");
                for (int k = j; k <= i + j; k++) {
                    s.append(str.charAt(k));
                }
                StringBuilder sb = new StringBuilder(s);
                if (s.compareTo(sb.reverse()) == 0) {
                    return s.toString();
                }
            }
        }

        return res;
    }
    public static void main(String[] args) {
//        System.out.println(longestPalindromeInAString1("aaaabbaa"));
        System.out.println(longestPalindromeInAString2("aaaabbaa"));
//        System.out.println(longestPalindromeInAString1("rfkqyuqfjkxy"));
//        System.out.println(longestPalindromeInAString1("abcdefghijklmnopqrstuvwxyz"));
    }
}
