import java.util.Scanner;

public class JavaStringsIntroduction {
    public static void main(String[] args) {
        String s1,s2;
        Scanner in = new Scanner(System.in);
        s1 = in.nextLine();
        s2 = in.nextLine();
        System.out.println(s1.length()+s2.length());
        if(s1.compareTo(s2)>0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        System.out.println(s1.substring(0,1).toUpperCase()+s1.substring(1)+" "+s2.substring(0,1).toUpperCase()+s2.substring(1));
    }
}
