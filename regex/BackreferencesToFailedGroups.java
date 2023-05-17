package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BackreferencesToFailedGroups {


    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\d{2}([-?])\\d{2}\\1\\d{2}\\1\\d{2}");
        Matcher matcher = pattern.matcher("x");
        boolean m = matcher.matches();
        System.out.println(m);
    }
}
