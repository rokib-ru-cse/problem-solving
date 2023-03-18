import java.text.Collator;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RemoveSpace {
    
    public String removeSpaceFromString(String s){
        return s.replaceAll(" ", "");
    }
   
    public static void main(String[] args) {
        System.out.println(new RemoveSpace().removeSpaceFromString("a b     c d ef    g"));
    }
}
