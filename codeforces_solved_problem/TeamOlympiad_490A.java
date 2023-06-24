import java.util.Arrays;
import java.util.Scanner;

public class TeamOlympiad_490A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr = new int[4][n+1];
        int x;
        for (int i = 1; i <= n; i++) {
            x = in.nextInt();
            arr[x][0]++;
            arr[x][arr[x][0]] =i;
        }
        int z = Math.min(arr[1][0],Math.min(arr[2][0],arr[3][0]));
        System.out.println(z);
        for (int i = 1; i <= z; i++) {
            System.out.println(arr[1][i]+" "+arr[2][i]+" "+arr[3][i]);
        }
    }
}
