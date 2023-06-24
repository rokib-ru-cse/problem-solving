import java.util.Arrays;
import java.util.Scanner;

public class SortNumbers {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a = new int[3];
        int[] b ;
        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextInt();
        }
        b  = a.clone();
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        System.out.println();
        for (int i = 0; i <3; i++) {
            System.out.println(b[i]);
        }
    }
}
