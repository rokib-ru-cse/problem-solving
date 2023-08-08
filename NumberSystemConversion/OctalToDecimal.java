package NumberSystemConversion;

public class OctalToDecimal {


    private static int octalToDecimal1(String octal) {
        int res = 0;
        for (int i = octal.length() - 1, j = 0; i >= 0; i--, j++) {
            if (octal.charAt(i) == '1') {
                res += Math.pow(8, j);
            }
        }
        return res;
    }

    private static int octalToDecimal2(String octal) {
        int res = 0;
        int len = octal.length();

        for (int i = 0; i < octal.length(); i++) {

            int bit = octal.charAt(len - 1 - i) - '0';
//            System.out.print((bit << (i * 3))+" ");
            res = res + (bit << (i * 3));
        }
        return res;
    }

    private static int octalToDecimal3(String octal) {
        return Integer.parseInt(octal, 8);
    }

    public static void main(String[] args) {
        System.out.println(octalToDecimal1("1111"));
        System.out.println(octalToDecimal2("1111"));
        System.out.println(octalToDecimal3("1111"));
    }
}
