package ecr125;
/**
 * Main
 */
import java.util.Scanner;

public class A_125 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int n;
        double a = 0.0;
        double b = 0.0;
        while (t-- > 0) {
            a = in.nextDouble();
            b = in.nextDouble();
            if (a == 0.0 && b == 0.0) {
                System.out.println(0);
            } else {
                int cnt = 0;
                double m = Math.min(a, b);
                for (double i = 0.0; i < m; i++) {
                    double c = Math.sqrt(Math.pow((0 - a), 2) + Math.pow((0 - b), 2));
                    
                }
            }
        }
    }
}
