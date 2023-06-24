import java.util.Scanner;

public class SoftDrinking_151A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int l = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        int p = in.nextInt();
        int nl = in.nextInt();
        int np = in.nextInt();

        int x = ((k * l) / n) / nl;
        int y = (c * d) / n;
        int z = (p / n) / np;
        System.out.println(Math.min(x, Math.min(y, z)));
    }
}
