import java.util.Scanner;

public class DigitsSummation {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        System.out.println((a%10)+(b%10));
    }
}
