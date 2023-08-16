package hackerrank_solved_problem.hackerrank_java;

import java.util.stream.Stream;

import static java.lang.Long.sum;

public class RecursiveDigitSum {

    public static int superDigit(String n, int k) {
        // Write your code here
        StringBuilder digits = new StringBuilder();
        for (int i = 0; i < k; i++) {
            digits.append(n);
        }
        return (int) divid(digits.toString());
    }

    private static long divid(String substring) {
        if (substring.length() == 1) {
            return substring.charAt(0) - '0';
        } else if (substring.length() >= 10) {
            return 9;
        }
        int sum = substring.chars().map(c -> c - '0').sum();
        if (sum > 9) {
            return divid(sum + "");
        } else {
            return sum;
        }
    }


    public static void main(String[] args) {
        int k = 1;
        StringBuilder p = new StringBuilder();
        String n = "1234";
        for (int i = 0; i < k; i++) {
            p.append(n);
        }
        System.out.println(superDigit(n, k));

    }
}
