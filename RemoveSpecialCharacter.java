public class RemoveSpecialCharacter {
    public String removeSpecialChar(String s){
        String sp = "!@#$%^&*()_+=-";
        String sb="";
        for (char c : s.toCharArray()) {
            if(!sp.contains(c+"")){
                sb+=c;
            }
        }
        return sb;
    }

    public String replaceSpcialChar(String s){
        return s.replaceAll("[^a-zA-Z0-9]", "");
    }

    public static void main(String[] args) {
        System.out.println(new RemoveSpecialCharacter().removeSpecialChar("j#a@v*a"));
        System.out.println(new RemoveSpecialCharacter().replaceSpcialChar("j#a@v*a"));
    }
}
