package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchingXRepetitions {


    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^[\\w]{40}[1,3,5,7,9,\\s]{5}$");
        Matcher matcher = pattern.matcher("x");
        boolean m = matcher.matches();
        System.out.println(m);
    }

}
