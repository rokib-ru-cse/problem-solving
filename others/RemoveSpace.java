package others;

public class RemoveSpace {
    
    public String removeSpaceFromString(String s){
        return s.replaceAll(" ", "");
    }
   
    public static void main(String[] args) {
        System.out.println(new RemoveSpace().removeSpaceFromString("a b     c d ef    g"));
    }
}
