package regex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DetectTheEmailAddress {


    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("\\w+[@][a-zA-Z]+[.][a-zA-Z]+",Pattern.CASE_INSENSITIVE);
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        List<String> emails = new ArrayList<>();
        while (n-->0){
            String text = input.nextLine();
            Matcher matcher = pattern.matcher(text);
            if (matcher.find()) {
                emails.add(matcher.group()+";");
            }
        }
        Collections.sort(emails);
    }
}
