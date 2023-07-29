package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchingSpecificCharacters {
    public static void main(String[] args) {
//        Pattern pattern = Pattern.compile("^[123][120][xs0][30Aa][xsu][.,]$");
        Pattern pattern = Pattern.compile("[12|3][12|0][xs|0][30A|a][xs|u][.|,]");
        Matcher matcher = pattern.matcher("11s3s.");
        boolean m = matcher.matches();
        System.out.println(m);
    }
}
