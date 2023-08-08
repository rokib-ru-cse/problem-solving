package others;

public class FirstNonRepeatedCharacter {

    public String firstNonRepeatedCharacter(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if(sb.indexOf(c+"")==-1){
                sb.append(c);
            }else{
                return sb.toString();
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(new FirstNonRepeatedCharacter().firstNonRepeatedCharacter("abcadea"));
    }
}
