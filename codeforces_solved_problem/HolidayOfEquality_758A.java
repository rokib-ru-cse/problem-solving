import java.util.Scanner;

public class HolidayOfEquality_758A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int max = Integer.MIN_VALUE;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
            max = Math.max(max,arr[i]);
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i]<max){
                sum+= max-arr[i];
            }
        }
        System.out.println(sum);
    }
}
