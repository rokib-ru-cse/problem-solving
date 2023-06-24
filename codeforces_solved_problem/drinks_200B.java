import java.util.Scanner;

public class drinks_200B {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        double sum = 0.0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
            sum+= arr[i];
        }
        System.out.println(sum/n);

    }
}
