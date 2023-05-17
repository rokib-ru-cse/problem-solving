package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchingZeroOrMoreRepetitions {

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^\\d{2,}[a-z]*[A-Z]*");
        Matcher matcher = pattern.matcher("x");
        boolean m = matcher.matches();
        System.out.println(m);
    }
}
