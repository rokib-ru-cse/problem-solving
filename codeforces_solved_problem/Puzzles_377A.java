import java.util.Arrays;
import java.util.Scanner;

public class Puzzles_377A {
    public static void main(String[] args) {
        int n, m;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        int arr[] = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i <= arr.length-n; i++) {
            min = Math.min(min, arr[n+i-1]-arr[i]);
        }
        System.out.println(min);
    }
}
