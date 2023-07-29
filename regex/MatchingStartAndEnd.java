package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchingStartAndEnd {
    public static void main(String[] args) {
//        Pattern pattern = Pattern.compile("^\\d[\\w]{4}.$");
        Pattern pattern = Pattern.compile("^[0-9]\\w{4}\\.$");
        Matcher matcher = pattern.matcher("1defe.");
        boolean m = matcher.matches();
        System.out.println(m);
    }
}
