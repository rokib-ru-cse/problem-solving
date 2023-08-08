package algorithm_java;

import java.util.Scanner;

public class PrefixSumPreComputation {
    private static int[] a = new int[100010];

    public static void prefixSum(){
        for (int i = 2; i < 100009; i++) {
            a[i] = a[i-1]+i;
        }
    }

    public static void main(String[] args) {
        a[0] = 0;
        a[1] = 1;
        prefixSum();
        Scanner in = new Scanner(System.in);
        int x = in.nextInt(); 
        int y = in.nextInt(); 
        for (int i = 1; i <= 10; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println(a[y]+" - "+a[x]+" = "+(a[y]-a[x]));
    }
}
