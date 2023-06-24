import java.util.Arrays;
import java.util.Scanner;

public class IsYourHorseshoeOnTheOtherHoof_228A {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long[] arr = new long[4];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextLong();
        }
        int sum = 0;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                sum++;
            }
        }
        System.out.println(sum);
    }
}
