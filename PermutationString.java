import java.util.ArrayList;
import java.util.List;

public class PermutationString {
    
    public static void main(String[] args) {
        String source = "abc";
        List<String> res= new ArrayList<>();
        for (int i = 0; i < source.length(); i++) {
            for (int j = 0; j < source.length(); j++) {
                int k=0;
                String temp = "";
                int x = j;
                int y=j;
                while(k<source.length()){
                    temp += source.charAt(x)+"";
                    k++;
                    y++;
                    x = y%source.length();
                }
                res.add(temp);
            }
        }
        for(String s:res){
            System.out.println(s);
        }
    }
}
