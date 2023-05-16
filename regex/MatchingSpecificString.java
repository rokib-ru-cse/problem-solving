package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchingSpecificString {


    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("hackerrank");
        Matcher matcher = pattern.matcher("The hackerrank team is on a mission to flatten the world by restructuring the DNA of every company on the planet. We rank programmers based on their coding skills, helping companies source great programmers and reduce the time to hire. As a result, we are revolutionizing the way companies discover and evaluate talented engineers. The hackerrank platform is the destination for the best engineers to hone their skills and companies to find top engineers.");
        int count = 0;
        while (matcher.find()){
            count++;
        }
        System.out.println(count);
    }
}
