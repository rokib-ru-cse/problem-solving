import java.lang.reflect.Array;
import java.util.Scanner;

public class Boredom_455A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[(int) 10e5];
        for (int i = 0; i < n; i++) {
            arr[in.nextInt()]++;
        }

    }
}
