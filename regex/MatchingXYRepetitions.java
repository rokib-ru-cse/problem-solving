package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchingXYRepetitions {
    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("^\\d{1,2}\\D{3,}[.]{0,3}$");
        Matcher matcher = pattern.matcher("x");
        boolean m = matcher.matches();
        System.out.println(m);
    }
}
