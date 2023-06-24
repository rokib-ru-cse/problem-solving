import java.util.Scanner;
public class Candies_1343A {

    public static void main(String[] args) {
        int t,n;
        Scanner in = new Scanner(System.in);
        t = in.nextInt();
        int i;
        while(t-->0){
            n = in.nextInt();
            for (i = 1; i < n; i++) {
                int sum=0;
                for (int j = 0;sum<=n ; j++ ) {
                    sum += i*Math.pow(2, j);
                    // System.out.print(sum+" ");
                    if(sum==n){
                        break;
                    }
                }
                if(sum==n){
                    break;
                }
            }
            System.out.println(i);
        }
    }
}
