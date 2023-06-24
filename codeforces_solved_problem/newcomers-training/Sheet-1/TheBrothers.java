import java.util.Scanner;

public class TheBrothers {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine().split(" ")[1];
        String s2 = in.nextLine().split(" ")[1];
        if(s1.equals(s2)){
            System.out.println("ARE Brothers");
        }else{
            System.out.println("NOT");
        }
    }
}
