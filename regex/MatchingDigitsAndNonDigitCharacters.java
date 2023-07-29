package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchingDigitsAndNonDigitCharacters {


    public static void main(String[] args) {
//        Pattern pattern = Pattern.compile("([\\d]{2}[\\D]{1}){2}[\\d]{4}");
        Pattern pattern = Pattern.compile("(\\d{2}\\D){2}\\d{4}");
        Matcher matcher = pattern.matcher("12s32d32434");
        boolean m = matcher.matches();
        System.out.println(m);
    }
}
