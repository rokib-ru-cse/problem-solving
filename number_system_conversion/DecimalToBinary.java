package number_system_conversion;

public class DecimalToBinary {

    private static String decimalToBinary1(int value) {
        StringBuilder res = new StringBuilder();
        while (value > 0) {
            res.insert(0, value % 2);
            value /= 2;
        }
        return res.toString();
    }

    private static String decimalToBinary2(int value) {
        if (value <= 1) {
            return value + "";
        }
        return decimalToBinary2(value / 2) + value % 2;
    }

    private static String decimalToBinary3(int value) {
        return Integer.toBinaryString(value);
    }

    private static String decimalToBinary4(int value) {
        StringBuilder res = new StringBuilder();
        while (value > 0) {
            int bit = value & 1;
            res.insert(0, bit);
            value = value >> 1;
        }
        return res.toString();
    }

    public static void main(String[] args) {
        System.out.println(decimalToBinary1(100));
        System.out.println(decimalToBinary2(100));
        System.out.println(decimalToBinary3(100));
        System.out.println(decimalToBinary4(100));
    }
}
