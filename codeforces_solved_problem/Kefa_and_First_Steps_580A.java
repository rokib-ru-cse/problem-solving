import java.util.Scanner;

public class Kefa_and_First_Steps_580A {
    int cnt = 0;

    public static void main(String[] args) {
        Kefa_and_First_Steps_580A obj = new Kefa_and_First_Steps_580A();
        Scanner in = new Scanner(System.in);
        int n = 0;
        n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int c = 1;
        int ans = 1;
        for (int i = 0; i < n-1; i++) {
            if(arr[i+1]>=arr[i]){
                c++;
            }else{
                c=1;
            }
            if(ans<=c){
                ans = c;
            }
        }
        System.out.println(ans);
    }
}