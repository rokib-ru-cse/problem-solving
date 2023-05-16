package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchingWhitespaceAndNonWhitespaceCharacter {


    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("([\\S]{2}[\\s]){2}[\\S]{2}");
        Matcher matcher = pattern.matcher("xx xx xx");
        boolean m = matcher.matches();
        System.out.println(m);
    }
}
