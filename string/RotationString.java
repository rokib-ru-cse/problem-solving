package string;

import java.util.ArrayList;
import java.util.List;

public class RotationString {

    public static boolean isRotationString1(String str1, String str2) {
        if (str1.equals(str2)) {
            return true;
        }
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str2.length(); i++) {
            if (str1.equals(str2.substring(i + 1) + str2.substring(0, i + 1))) {
                return true;
            }
        }
        return false;
    }

    public static boolean isRotationString2(String str1, String str2) {
        if (str1.equals(str2)) {
            return true;
        }
        if (str1.length() != str2.length()) {
            return false;
        }
        List<Integer> indexes = new ArrayList<>();
        for (int i = 0; i < str2.length(); i++) {
            if (str1.charAt(0) == str2.charAt(i)) {
                indexes.add(i);
            }
        }
        boolean isRotation = true;
        for (int i : indexes) {
            isRotation = true;
            for (char c : str1.toCharArray()) {
                if (c != str2.charAt(i % str2.length())) {
                    isRotation = false;
                    break;
                }
                i++;
            }
        }
        return isRotation;
    }


    public static void main(String[] args) {
        System.out.println(isRotationString1("ABAD", "ADAB"));
        System.out.println(isRotationString2("ABAD", "ADAB"));
    }
}
