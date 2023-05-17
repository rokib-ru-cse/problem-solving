package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchingSameTextAgainAndAgain {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("([a-z])(\\w)(\\s)(\\W)(\\d)(\\D)([A-Z])([A-Za-z])([aeiouAEIOU])(\\S)\\1\\2\\3\\4\\5\\6\\7\\8\\9\\10");
        Matcher matcher = pattern.matcher("x");
        boolean m = matcher.matches();
        System.out.println(m);
    }
}
