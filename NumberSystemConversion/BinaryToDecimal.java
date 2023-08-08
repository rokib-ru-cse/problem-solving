package NumberSystemConversion;

public class BinaryToDecimal {

    private static int binaryToDecimal1(String binary) {
        int res = 0;
        for (int i = binary.length() - 1, j = 0; i >= 0; i--, j++) {
            if (binary.charAt(i) == '1') {
                res += Math.pow(2, j);
            }
        }
        return res;
    }

    private static int binaryToDecimal2(String binary) {
        int res = 0;
        int len = binary.length();
        for (int i = 0; i < binary.length(); i++) {
            int bit = binary.charAt(len - 1 - i) - '0';
//            System.out.print((bit<<i)+" ");
            res = res + (bit << i);
        }
        return res;
    }

    private static int binaryToDecimal3(String binary) {
        return Integer.parseInt(binary, 2);
    }

    public static void main(String[] args) {
        System.out.println(binaryToDecimal1("1111"));
        System.out.println(binaryToDecimal2("1111"));
        System.out.println(binaryToDecimal3("1111"));
    }
}
