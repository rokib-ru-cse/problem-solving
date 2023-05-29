public class ReverseString {
    public String reverse1(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    public String reverse2(String s) {
        String sb = "";
        for (char c : s.toCharArray()) {
            sb = c+""+sb;
        }
        return sb;
    }

    public String reverse3(String s) {
        String sb ="";
        for (int i = s.length()-1; i >=0 ; i--) {
            sb = sb+s.toCharArray()[i];
        }
        return sb;
    }

    public String reverse4(String s) {
        return null;
    }

    public static void main(String[] args) {
        System.out.println(new ReverseString().reverse1("abcxyz"));
        System.out.println(new ReverseString().reverse2("abcxyz"));
        System.out.println(new ReverseString().reverse3("abcxyz"));
        System.out.println(new ReverseString().reverse4("abcxyz"));
    }
}
