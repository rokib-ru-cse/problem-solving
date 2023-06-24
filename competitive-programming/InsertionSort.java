import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a = new int[3];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int)(Math.random()*100+1);
        }
        for (int i : a) {
            System.out.print(i+" ");
        }
        System.out.println();
        for (int i = 1; i < a.length; i++) {
            int current = a[i];
            int j = i-1;
        }
        for (int i : a) {
            System.out.print(i+" ");
        }
    }
}
