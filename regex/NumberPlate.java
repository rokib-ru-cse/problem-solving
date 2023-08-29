package regex;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberPlate {
    private static final String BD_CAR_NUMBER_PLATE = "AAA 12 3456";
    private static final String US_CAR_NUMBER_PLATE = "ABC 123";
    private static final String UK_CAR_NUMBER_PLATE = "AB12 CDE";
    private static final String AU_CAR_NUMBER_PLATE = "1AB-234";
    private static final String CA_CAR_NUMBER_PLATE = "ABC 123";
    private static final String IN_CAR_NUMBER_PLATE = "AB 12 XY 3456";
    private static final String JP_CAR_NUMBER_PLATE = "12-34 56";
    private static final String DE_CAR_NUMBER_PLATE = "ABC-123"; //Germany
    private static final String FR_CAR_NUMBER_PLATE = "1234 AB 56";
    private static final String ZA_CAR_NUMBER_PLATE = "AB 123 CD"; //South Africa
    private static final String CN_CAR_NUMBER_PLATE = "AB12345"; //China

    public static void main(String[] args) {
        String[] testCarNumbers = {
                "DHK 15 6789", // Valid
                "CTG 21 9876", // Valid
                "XYZ 18 4567", // Invalid district code
                "DHK 05 1234", // Invalid year
                "DHK 12 0000", // Invalid unique number
                "SYL 22 9999", // Valid
                "SYL 23 10000", // Invalid unique number
                "DHK 18",      // Invalid format (incomplete)
                "DHK 18 9876 XYZ", // Invalid format (too long)
                "DHK ABCD 1234", // Invalid district code
                "ABC 12 3456", // Valid (numeric district code)
                "ABCj12j3456"   // Valid (numeric district code)
        };

        for (String carNumber : testCarNumbers) {
            boolean isValid = testBDCarNumberRegex(carNumber);
            System.out.println(carNumber + " is " + (isValid ? "valid" : "invalid"));
        }
    }

    private static boolean testBDCarNumberRegex(String bdTestCarNumberRight) {
        Pattern pattern = Pattern.compile("^(DHK|RAJ|CTG|KHU|BAR|RAN|MYN|SYL) (1\\d|2[0-3]) ([1-9]\\d{0,3}|9999)$");
        Matcher matcher = pattern.matcher(bdTestCarNumberRight);
        if (matcher.find()) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean testBDCarNumber(String bdTestCarNumberRight) {
        List<String> validDistrictCode = List.of("DHK", "RAJ", "CTG", "KHU", "BAR", "RAN", "MYN", "SYL");
        if (bdTestCarNumberRight.length() != 11) {
            return false;
        }

        String[] carNumber = bdTestCarNumberRight.split(" ");
        if (carNumber.length != 3) {
            return false;
        }

        String districtCode = carNumber[0];
        int year = Integer.parseInt(carNumber[1]);
        int uniqueNumber = Integer.parseInt(carNumber[2]);


        if (!validDistrictCode.contains(districtCode)) {
            return false;
        }
        if (year < 10 || year > 23) {
            return false;
        }
        return uniqueNumber >= 1 && uniqueNumber <= 9999;
    }
}
