import java.util.Scanner;

public class fibonacci {
    private static int[] allf;
    private static void initf() {
        for (int i = 0; i < allf.length; i++) {
            allf[i]=-1;
        }
    }

    private static int fib(int n) {
        if(n==0) return 0;
        if(n==1) return 0;
        if(n==2) return 1;
        if(allf[n]!=-1) return allf[n];
        allf[n] = fib(n-1)+fib(n-2);
        return allf[n];
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        allf = new int[n+1];
        initf();
        fib(n);
        for (int i = 0; i < allf.length; i++) {
            System.out.print(allf[i]+" ");
        }
    }

    
}
