package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExcludingSpecificCharacters {

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("[^\\d][^aeiou][^bcDF][^\\r\\n\\t\\f\\s][^AEIOU][^.,]");
        Matcher matcher = pattern.matcher("think?");
        boolean m = matcher.matches();
        System.out.println(m);
    }
}
