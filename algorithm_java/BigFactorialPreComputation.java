import java.util.Scanner;

public class BigFactorialPreComputation {
    private static int[] a = new int[100010];
    public static void fact(){
        int m = 1000000007;
        for (int i = 2; i < 100010; i++) {
            a[i] = (a[i-1]*(i%m))%m;;
        }
    }
    public static void main(String[] args) {
        a[0]=a[1] = 1;
        Scanner in = new Scanner(System.in);
        int value = in.nextInt();
        fact();
        System.out.println(a[value]);
        in.close();
    }
}
