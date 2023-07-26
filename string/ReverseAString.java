package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseAString {

    private static String res;

    private static String reverseAString1(String value) {
        return new StringBuilder(value).reverse().toString();
    }

    private static String reverseAString2(String value) {
        return new StringBuffer(value).reverse().toString();
    }

    private static String reverseAString3(String value) {
        String res = "";
        for (int i = 0; i < value.toCharArray().length; i++) {
            res = value.charAt(i) + res;
        }
        return res;
    }

    private static String reverseAString4(String value) {
        String res = "";
        for (int i = value.toCharArray().length - 1; i >= 0; i--) {
            res = res + value.charAt(i);
        }
        return res;
    }

    private static String reverseAString5(String value) {
        char[] chars = value.toCharArray();
        int leftPointer = 0;
        int rightPointer = value.length() - 1;
        while (leftPointer < rightPointer) {
            char temp = chars[leftPointer];
            chars[leftPointer] = chars[rightPointer];
            chars[rightPointer] = temp;
            leftPointer++;
            rightPointer--;
        }
        return new String(chars);
    }

    private static String reverseAString6(String value) {
        if (value.isBlank()) {
            return value;
        }
        return reverseAString6(value.substring(1)) + value.charAt(0);
    }

    private static String reverseAString7(String value) {
        return value.chars() //xxxxxxxxxxxxxxxxxxxxxxxxxxxxx
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining("", "", ""));
    }



    public static void main(String[] args) {
        System.out.println(reverseAString1("abcd"));
        System.out.println(reverseAString2("abcd"));
        System.out.println(reverseAString3("abcd"));
        System.out.println(reverseAString4("abcd"));
        System.out.println(reverseAString5("abcd"));
        System.out.println(reverseAString6("abcd"));
        System.out.println(reverseAString7("abcd"));
    }
}
