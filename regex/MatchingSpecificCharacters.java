package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchingSpecificCharacters {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^[123][120][xs0][30Aa][xsu][.,]$");
        Matcher matcher = pattern.matcher("11s3s.");
        boolean m = matcher.matches();
        System.out.println(m);
    }
}
