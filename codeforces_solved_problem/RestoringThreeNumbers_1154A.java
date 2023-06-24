import java.util.Arrays;
import java.util.Scanner;

public class RestoringThreeNumbers_1154A {
    public static void main(String[] args) {
        int[] x = new int[4];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            x[i] = in.nextInt();
        }
        Arrays.sort(x);
        int a = ((x[0]+x[1])-x[2])/2;
        int b = x[0]-a;
        int c = x[1]-a;
        System.out.println(a+" "+b+" "+c);
    }
}
