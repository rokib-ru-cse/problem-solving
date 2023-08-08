package NumberSystemConversion;

public class DecimalToAnyBase {


    private static String decimalToAnyBase1(int value, int base) {
        StringBuilder res = new StringBuilder();
        while (value > 0) {
            res.insert(0, value % base);
            value /= base;
        }
        return res.toString();
    }


    public static void main(String[] args) {
        System.out.println(decimalToAnyBase1(8, 3));
    }
}
