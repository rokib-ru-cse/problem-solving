package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\+\\d\\s\\d{3}\\s\\d{3}\\s\\d{3}");
        Matcher matcher = pattern.matcher("+1 232 435 434");
        boolean m = matcher.matches();
        System.out.println(m);

    }
}
