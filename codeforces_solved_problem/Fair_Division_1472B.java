import java.util.Scanner;

public class Fair_Division_1472B {
    public static void main(String[] args) {
        int t, n;
        Scanner in = new Scanner(System.in);
        t = in.nextInt();
        while (t-- > 0) {
            n = in.nextInt();
            int[] arr = new int[n];
            int one = 0, two = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
                if (arr[i] == 1) {
                    one++;
                } else {
                    two++;
                }
            }

            if (one % 2 == 0 && one > 1) {
                System.out.println("YES");
            } else if (one % 2 == 0 && two % 2 == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

    }
}
