package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchingWordBoundaries {

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^[aeiouAEIOU][A-Za-z]*");
        Matcher matcher = pattern.matcher("x");
        boolean m = matcher.matches();
        System.out.println(m);
    }
}
