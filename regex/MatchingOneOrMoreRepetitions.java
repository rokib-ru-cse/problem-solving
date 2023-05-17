package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchingOneOrMoreRepetitions {


    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^\\d+[A-Z]+[a-z]+$");
        Matcher matcher = pattern.matcher("x");
        boolean m = matcher.matches();
        System.out.println(m);
    }
}
