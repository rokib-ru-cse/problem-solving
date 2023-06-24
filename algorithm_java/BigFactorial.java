import java.util.Scanner;

/**
 * BigFactorial
 */
public class BigFactorial {
    public static long fact(long value) {
        long newFact = 1;
        int m = 47;
        for (int i = 2; i <= value; i++) {
            newFact = (newFact * i)%m;
        }
        return newFact;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long value = in.nextLong();
        System.out.println("factorial of " + value + " is = " + fact(value));
        in.close();
    }
}