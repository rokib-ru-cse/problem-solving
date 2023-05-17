package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchingEndingItems {

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("$[A-Za-z]*s$");
        Matcher matcher = pattern.matcher("x");
        boolean m = matcher.matches();
        System.out.println(m);
    }
}
