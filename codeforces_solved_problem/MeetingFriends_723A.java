import java.util.Arrays;
import java.util.Scanner;

public class MeetingFriends_723A {
    public static void main(String[] args) {
        int[] a = new int[3];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            a[i] = in.nextInt();
        }
        Arrays.sort(a);
        System.out.println((a[1] - a[0]) + (a[2] - a[1]));
    }
}
