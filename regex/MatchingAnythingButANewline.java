package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchingAnythingButANewline {

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("([^\\n]{3})[.]([^\\n]{3})[.]([^\\n]{3})[.]([^\\n]{3})");
        Matcher matcher = pattern.matcher("1123.456.abc.def"); // false
        boolean m = matcher.matches();
        System.out.println(m);
    }
}
