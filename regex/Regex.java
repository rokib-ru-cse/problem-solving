package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

    public static void main(String[] args) {
//        Pattern pattern = Pattern.compile("sadin");
//        Matcher matcher = pattern.matcher("sadin");
//        boolean x = matcher.find();
//        System.out.println(x);
        Pattern pattern = Pattern.compile("sadin \\d{3,4}");
        Matcher matcher = pattern.matcher("sadin 12562");
        boolean isMatched = matcher.find();
        System.out.println(isMatched);
    }
}
