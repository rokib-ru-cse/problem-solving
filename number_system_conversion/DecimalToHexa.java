package number_system_conversion;

public class DecimalToHexa {


    private static String decimalToHexa1(int value) {
        StringBuilder res = new StringBuilder();
        while (value > 0) {
            res.insert(0, Integer.toHexString(value % 16));
            value /= 16;
        }
        return res.toString();
    }

    private static String decimalToHexa2(int value) {
        if (value < 16) {
            return Integer.toHexString(value);
        }
        return decimalToHexa2(value / 16) + Integer.toHexString(value % 16);
    }

    private static String decimalToHexa3(int value) {
        return Integer.toHexString(value);
    }

    private static String decimalToHexa4(int value) {
        StringBuilder res = new StringBuilder();
        while (value > 0) {
            int bit = value & 15;
            res.insert(0, Integer.toHexString(bit));
            value = value >> 4;
        }
        return res.toString();
    }

    public static void main(String[] args) {
        System.out.println(decimalToHexa1(435));
        System.out.println(decimalToHexa2(435));
        System.out.println(decimalToHexa3(435));
        System.out.println(decimalToHexa4(435));
    }
}
