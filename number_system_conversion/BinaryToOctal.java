package number_system_conversion;

public class BinaryToOctal {

    private static String binaryToOctal1(String binary) {
        int decimal = Integer.parseInt(binary, 2);
        return Integer.toOctalString(decimal);
    }

    private static String binaryToOctal2(String binary) {
        int len = binary.length();
        int padding = 3 - (len % 3);
        StringBuilder paddedBinary = new StringBuilder();
        for (int i = 0; i < padding; i++) {
            paddedBinary.append('0');
        }
        paddedBinary.append(binary);
        StringBuilder octal = new StringBuilder();
        for (int i = 0; i < paddedBinary.length(); i += 3) {
            String triplet = paddedBinary.substring(i, i + 3);
            int decimal = Integer.parseInt(triplet, 2);
            octal.append(decimal);
        }
        return octal.toString();
    }

    private static int binaryToOctal3(String binary) {
        return Integer.parseInt(binary, 2);
    }

    public static void main(String[] args) {
        System.out.println(binaryToOctal1("1111"));
        System.out.println(binaryToOctal2("1111"));
        System.out.println(binaryToOctal3("1111"));
    }
}
