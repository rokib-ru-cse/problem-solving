package string;

public class PalindromeString {

    public static boolean isStringPalindrome1(String str) {
        return str.contentEquals(new StringBuilder(str).reverse());
    }

    public static boolean isStringPalindrome2(String str) {
        if (str.isBlank()) {
            return true;
        }
        int leftPointer = 0;
        int rightPointer = str.length() - 1;
        while (leftPointer < rightPointer) {
            if (str.charAt(leftPointer) != str.charAt(rightPointer)) {
                return false;
            }
            leftPointer++;
            rightPointer--;
        }
        return true;
    }

    public static boolean isStringPalindrome3(String str) {
        if (str.length()<=1) {
            return true;
        }
        if (str.charAt(0) != str.charAt(str.length() - 1)) {
            return false;
        }
        return isStringPalindrome3(str.substring(1, str.length() - 1));
    }

    public static void main(String[] args) {
        System.out.println(isStringPalindrome1("abcba"));
        System.out.println(isStringPalindrome2("abcba"));
        System.out.println(isStringPalindrome3("abcba"));
    }
}
