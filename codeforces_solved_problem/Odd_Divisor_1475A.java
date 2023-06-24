import java.util.Scanner;

public class Odd_Divisor_1475A {

    public static void main(String[] args) {
        long n, m;
        Scanner in = new Scanner(System.in);
        n = in.nextLong();
        while (n-- > 0) {
            boolean flag = false;
            m = in.nextLong();
            while (m > 1) {
                if (m % 2 == 1) {
                    System.out.println("YES");
                    flag = true;
                    break;
                } else {
                    m /= 2;
                }
            }
            if (!flag) {
                System.out.println("NO");
            }

        }

    }

}
