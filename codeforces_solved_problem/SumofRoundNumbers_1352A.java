import java.util.Scanner;

public class SumofRoundNumbers_1352A {
    public static void main(String[] args) {
        int t;
        Scanner in = new Scanner(System.in);
        t = in.nextInt();
        while (t-- > 0) {
            int a = in.nextInt();
            StringBuilder sb = new StringBuilder();
            int c = 0;
            while (a > 0) {
                int i = 1;
                while (a % (int) Math.pow(10, i) == 0) {
                    i++;
                }
                sb.append(a % (int) Math.pow(10, i)).append(" ");
                c++;
                a /= (int) Math.pow(10, i);
                a *= (int) Math.pow(10, i);
            }
            System.out.println(c);
            System.out.println(sb);
        }
    }
}
