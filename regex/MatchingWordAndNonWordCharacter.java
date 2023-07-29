package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchingWordAndNonWordCharacter {

    public static void main(String[] args) {
//        Pattern pattern = Pattern.compile("[\\w]{3}[\\W][\\w]{10}[\\W][\\w]{3}");
        Pattern pattern = Pattern.compile("\\w{3}\\W\\w10}\\W\\w{3}");
        Matcher matcher = pattern.matcher("s");
        boolean m = matcher.matches();
        System.out.println(m);
    }
}
