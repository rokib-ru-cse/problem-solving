import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Dragons_230A {
    public static void main(String[] args) {
        int s, n;
        Scanner in = new Scanner(System.in);
        s = in.nextInt();
        n = in.nextInt();
        Pair[] p = new Pair[n];
        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            p[i] = new Pair(a,b);
        }
        Arrays.sort(p, new Comparator<Pair>() {
            @Override
            public int compare(Pair p1, Pair p2) {
                return p1.getKey()-p2.getKey();
            }
        });

        boolean flag = true;
        for (Pair pair : p) {
            if (pair.getKey() < s) {
                s += pair.getValue();
            } else {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
