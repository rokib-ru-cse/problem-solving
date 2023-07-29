package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchingCharacterRanges {

    public static void main(String[] args) {
//        Pattern pattern = Pattern.compile("^[a-z][1-9][^a-z][^A-Z][A-Z].*");
        Pattern pattern = Pattern.compile("[a-z][1-9][^a-z][^A-Z][A-Z].+");
        Matcher matcher = pattern.matcher("think?");
        boolean m = matcher.matches();
        System.out.println(m);
    }
}
