import java.util.Arrays;
import java.util.Scanner;

public class Vanya_and_Lanterns_492B {

    public static void main(String[] args) {
        int n, m;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);
        double max = 0.0;
        if (arr[0] != 0) {
            max = arr[0];
        }
        if (arr[n - 1] != m) {
            if (m - arr[n - 1] > max) {
                max = m - arr[n - 1];
            }
        }
        for (int i = 0; i < n - 1; i++) {
            if ((arr[i + 1] - arr[i]) / 2.0 > max) {
                max = (arr[i + 1] - arr[i]) / 2.0;
            }
        }
        System.out.printf("%.9f", max);
        System.out.println();

    }

}
