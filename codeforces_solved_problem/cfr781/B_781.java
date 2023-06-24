import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class B_781 {

    public static boolean equal(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            int[] arr = new int[n];
            int[] newarr;
            int op = 0;
            for (int j = 0; j < n; j++) {
                arr[j] = in.nextInt();
            }
            boolean flag = equal(arr);
            if (flag) {
                System.out.println(op);
            } else {
                int index = 0;
                int cnt = 0;
                for (int j = 0; j < arr.length; j++) {
                    cnt = Math.max(cnt, Collections.frequency(Arrays.asList(arr), arr[j]));
                }
                op = 0;
                int c = cnt;
                for (int i = cnt; (cnt) < n; i++) {
                    c = cnt;
                    cnt = (int) Math.pow(2, i);
                    if (cnt >= n) {
                        op = op + (n - c);
                        break;

                    } else {
                        op = op + c;
                    }
                    op++;
                }
                System.out.println(op);

            }

        }
    }
}
