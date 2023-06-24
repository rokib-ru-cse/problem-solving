import java.util.Scanner;

public class B_125 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            int a = in.nextInt();
            int[] arr1 = new int[a];
            int[] arr2 = new int[a];
            for (int i = 0; i < a; i++) {
                arr1[i] = in.nextInt();
            }
            for (int i = 0; i < a; i++) {
                arr2[i] = in.nextInt();
            }
            int sum = 0;
            if(a%2!=0){
                for (int i = 0; i < a-1; i++) {
                    sum += Math.abs(arr1[i]-arr2[i+1]);
                }
                for (int i = 0; i < a-1; i++) {
                    sum += Math.abs(arr1[i+1]-arr2[i]);
                }
            }
            else{
                sum += Math.abs(arr1[1]-arr2[1]);
                sum += Math.abs(arr1[a-1]-arr2[a-1]);
            }
            System.out.println(sum);
            
        }
    }
}
