import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class RemoveSmallest_1399A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            int n = in.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }
            Arrays.sort(arr);
            boolean flag = true;
            for (int i = 0; i < n-1; i++) {
                if(Math.abs(arr[i]-arr[i+1])>1){
                    flag = false;
                    break;
                }
            }
            if (!flag) {
                sb.append("NO\n");
            } else {
                sb.append("YES\n");
            }
        }
        System.out.println(sb);

    }
}
