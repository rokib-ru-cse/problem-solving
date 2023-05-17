package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AlternativeMatching {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^(Mr\\.|Mrs\\.|Ms\\.|Dr\\.|Er\\.)[A-Za-z]+$");
        Matcher matcher = pattern.matcher("x");
        boolean m = matcher.matches();
        System.out.println(m);
    }
}
