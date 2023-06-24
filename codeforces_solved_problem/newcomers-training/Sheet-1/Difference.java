import java.util.Scanner;

public class Difference {
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        long d = in.nextLong();
        System.out.println("Difference = "+((a*b)-(c*d)));
    }
}
