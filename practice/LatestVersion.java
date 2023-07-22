package practice;

import java.util.ArrayList;
import java.util.List;

public class LatestVersion {
    public static void main(String[] args) {
        List<String> versions = new ArrayList<>();
        versions.add("1.2");
        versions.add("1.2.2.3");
        versions.add("1.3.2.1");
        versions.add("2.2");
        versions.add("2.3");
        versions.add("3.3");
        versions.add("3.2");
        versions.add("2.2.1");
        versions.add("2.1.1");
        versions.add("2.3.1");

        String latest = "-1.";
        for (String version : versions) {

            String[] currentDigits = version.split("\\.");
            String[] oldDigits = latest.split("\\.");
            int i=0;
            while (true) {
                if(oldDigits.length==i){
                    latest =  version;
                    break;
                }
                if (currentDigits.length==i){
                    break;
                }
                int currnetIntDigit = Integer.parseInt(currentDigits[i]);
                int oldIntDigit = Integer.parseInt(oldDigits[i]);
                if(currnetIntDigit>oldIntDigit){
                    latest = version;
                    break;
                } else if (currnetIntDigit==oldIntDigit) {
                    i++;
                }else{
                    break;
                }
            }
        }
        System.out.println("latest version is "+latest);
    }
}
