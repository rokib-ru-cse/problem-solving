import java.util.Scanner;

public class GenerateParenthesis {

    private static StringBuilder result = new StringBuilder();

    public static void generateParenthesis(StringBuilder sb,int open,int close){

        if(close==0&&open==0){
            result.append(sb+" ");
            return ;
        }
        if(open>0){
            
            sb.append("(");
            generateParenthesis(sb,open-1,close);
            sb.deleteCharAt(sb.length() - 1);
        }
        if(close>0){
            if(open<close){
                sb.append(")");
                generateParenthesis(sb,open,close-1);
                sb.deleteCharAt(sb.length() - 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p = in.nextInt();
        generateParenthesis(new StringBuilder("("),p-1,p);
        System.out.println(result);
        
    }
}
