import java.util.Scanner;

public class LearnfromMath_472 {

    private static boolean isPrime(int a) {
        if (a % 2 == 0) {
            return false;
        } else {
            for (int i = 3; i <= (int) Math.sqrt(a); i++) {
                if (a % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int a, x, y;
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        int m = a / 2;
        int n = a - m;
        while (m > 0 && n > 0) {
            boolean x1 = isPrime(m);
            boolean x2 = isPrime(n);
            if ( !x1&&!x2) {
                break;
            } else {
                m -= 1;
                n += 1;
            }
            
        }
        System.out.println(m + " " + n);
    }
}
