import java.util.Scanner;

public class Cut_Ribbon_189A {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int sum = (n%a==b)||(n%a==c)?n/a+1:n%a==0?n/a:0;
        int sum1 = (n%b==a)||(n%b==c)?n/b+1:n%b==0?n/b:0;
        int sum2 = (n%c==b)||(n%c==a)?n/c+1:n%c==0?n/c:0;
        System.out.println(Math.max(sum,Math.max(sum1,sum2)));
    }
}
