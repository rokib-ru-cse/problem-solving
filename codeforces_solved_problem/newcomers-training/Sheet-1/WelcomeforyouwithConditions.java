import java.util.Scanner;

public class WelcomeforyouwithConditions {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        if(a>=b){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
