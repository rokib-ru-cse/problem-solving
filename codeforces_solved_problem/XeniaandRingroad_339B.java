import java.util.Scanner;

public class XeniaandRingroad_339B {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = in.nextInt();
        }
        int x = arr[0] - 1;
        for (int i = 1; i < m; i++) {
            if (arr[i] < arr[i - 1]) {
                x += (n - arr[i - 1]) + arr[i];
            } else if (arr[i] > arr[i - 1]) {
                x += arr[i] - arr[i - 1];
            }
        }
        System.out.println(x);
    }
}
