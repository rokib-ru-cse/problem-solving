package NumberSystemConversion;

public class HexaToDecimal {


    private static int hexaToDecimal1(String hexa) {
        int res = 0;
        for (int i = hexa.length() - 1, j = 0; i >= 0; i--, j++) {
            if (hexa.charAt(i) == '1') {
                res += Math.pow(16, j);
            }
        }
        return res;
    }

    private static int hexaToDecimal2(String hexa) {
        int res = 0;
        int len = hexa.length();

        for (int i = 0; i < hexa.length(); i++) {

            int bit = hexa.charAt(len - 1 - i) - '0';
//            System.out.print((bit << (i * 4))+" ");
            res = res + (bit << (i * 4));
        }
        return res;
    }

    private static int hexaToDecimal3(String hexa) {
        return Integer.parseInt(hexa, 16);
    }

    public static void main(String[] args) {
        System.out.println(hexaToDecimal1("1111"));
        System.out.println(hexaToDecimal2("1111"));
        System.out.println(hexaToDecimal3("1111"));
    }
}
