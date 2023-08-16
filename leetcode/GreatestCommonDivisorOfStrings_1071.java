//package leetcode;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Map;
//
//public class GreatestCommonDivisorOfStrings_1071 {
//
//    public static String gcdOfStrings(String str1, String str2) {
//
//        int i = 0;
//        int j = 1;
//
//        List<String> divisors = new ArrayList<>();
//        String subs = "";
//        while (i < str1.length() && j<str1.length()) {
//            String pre = subs;
//            subs = str1.substring(i, j);
//            if (str2.contains(subs)) {
//                j++;
//            } else {
//                divisors.add(pre);
//                i++;
//                j = i+1;
//            }
//        }
//        for (String s : divisors) {
//            System.out.println(s);
//        }
//
//        return divisors.stream().mapToInt(c->c.length()==);
//    }
//
//    public static void main(String[] args) {
//gcdOfStrings("ABCABC","ABC");
//    }
//}
