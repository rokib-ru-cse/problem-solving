package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchingAnythingButANewline {

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("([^\\n]{3})[.]([^\\n]{3})[.]([^\\n]{3})[.]([^\\n]{3})");
        Matcher matcher = pattern.matcher("abc.def.ghi.jkx");
        boolean m = matcher.matches();
        System.out.println(m);
    }
}
