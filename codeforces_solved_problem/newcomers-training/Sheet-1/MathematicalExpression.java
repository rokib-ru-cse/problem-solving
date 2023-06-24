import java.util.Scanner;

public class MathematicalExpression {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        if(s.contains("+")){
            String[] s1 = s.split(" ");
            if((Integer.parseInt(s1[0])+Integer.parseInt(s1[2]))==Integer.parseInt(s1[4])){
                System.out.println("Yes");
            }else{
                System.out.println(Integer.parseInt(s1[0])+Integer.parseInt(s1[2]));
            }
            
        }
        else if(s.contains("-")){
            String[] s1 = s.split(" ");
            if((Integer.parseInt(s1[0])-Integer.parseInt(s1[2]))==Integer.parseInt(s1[4])){
                System.out.println("Yes");
            }else{
                System.out.println(Integer.parseInt(s1[0])-Integer.parseInt(s1[2]));
            }
        }else{
            String[] s1 = s.split(" ");
            if((Integer.parseInt(s1[0])*Integer.parseInt(s1[2]))==Integer.parseInt(s1[4])){
                System.out.println("Yes");
            }else{
                System.out.println(Integer.parseInt(s1[0])*Integer.parseInt(s1[2]));
            }
        }
    }
}
