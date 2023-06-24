import java.util.Scanner;

public class Multiples {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        if(a%b==0 || b%a==0){
            System.out.println("Multiples");
        }else{
            System.out.println("No Multiples");
        }
    }
}
