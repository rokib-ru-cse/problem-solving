package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CapturingAndNonCapturingGroups {

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("[.]*(ok){3}[.]*");
        Matcher matcher = pattern.matcher("x");
        boolean m = matcher.matches();
        System.out.println(m);
    }
}
