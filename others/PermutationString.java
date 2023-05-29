import java.util.ArrayList;
import java.util.List;

public class PermutationString {
    
    public static void main(String[] args) {
        String source = "abc";
        int total=1;
        for (int i = 1; i <= source.length(); i++) {
            total=total*i;
        }
        List<String> res= new ArrayList<>();
        int z=0;
        for (int i = 0; i < total; i++) {
            int k=0;
            String temp = "";
            int x = i%source.length();
            while(k<source.length()){
                temp += source.charAt(x)+"";
                k++;
                x = (k+i)%source.length();
            }
            res.add(temp);
            z++;
        }
        for(String s:res){
            System.out.println(s);
        }
    }
}
