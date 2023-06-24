import java.util.Scanner;

public class JavaLoopsII {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            int s=a;
            for (int i = 0; i < c; i++) {
                s += ((int)Math.pow(2, i)*b);
                System.out.print(s+" ");
            }
            System.out.println();

        }
    }
}
