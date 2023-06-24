package cr777;
import java.util.Arrays;
import java.util.Scanner;
public class A_777 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int n;
        
        while(t-->0){
            n = in.nextInt();
            StringBuilder sb = new StringBuilder();
            int[] s = new int[100];
            int j=1;
            int k = 0;
            int sum=0;
            while(n>0){
                for (int i = n; i >0; i--) {
                    sb.append(String.valueOf(i));
                    sum+=i;
                    if(sum == n){
                        break;
                    }
                }
                s[k] = Integer.parseInt(sb.toString());
                n-=j;
                j++;
                k++;
            }
            Arrays.sort(s);
            System.out.println(s[s.length-1]);
        }
    }
}
