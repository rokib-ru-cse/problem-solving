package NumberSystemConversion;

public class DecimalToOctal {


    private static String decimalToOctal1(int value) {
        StringBuilder res = new StringBuilder();
        while (value > 0) {
            res.insert(0, value % 8);
            value /= 8;
        }
        return res.toString();
    }

    private static String decimalToOctal2(int value) {
        if (value < 8) {
            return Integer.toString(value);
        }
        return decimalToOctal2(value / 8) + value % 8;
    }

    private static String decimalToOctal3(int value) {
        return Integer.toOctalString(value);
    }

    private static String decimalToOctal4(int value) {
        StringBuilder res = new StringBuilder();
        while (value > 0) {
            int bit = value & 7;
            res.insert(0, bit);
            value = value >> 3;
        }
        return res.toString();
    }

    public static void main(String[] args) {
        System.out.println(decimalToOctal1(100));
        System.out.println(decimalToOctal2(100));
        System.out.println(decimalToOctal3(100));
        System.out.println(decimalToOctal4(100));
    }
}
