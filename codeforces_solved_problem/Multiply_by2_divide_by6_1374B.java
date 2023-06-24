import java.util.Scanner;

public class Multiply_by2_divide_by6_1374B {

    public static void main(String[] args) {
        long n, m;
        Scanner in = new Scanner(System.in);
        n = in.nextLong();
        while (n-- > 0) {
            boolean flag = false;
            m = in.nextLong();
            int cnt2 = 0;
            int cnt3 = 0;
            while (m % 2 == 0) {
                cnt2++;
                m /= 2;
            }
            while (m % 3 == 0) {
                cnt3++;
                m /= 3;
            }
            if (m != 1 || cnt2 > cnt3) {
                System.out.println(-1);
            } else {
                System.out.println(cnt3 - cnt2 + cnt3);
            }
        }

    }
}
