package interview;

public class IntPalindrome {


    public static void main(String[] args) {
        System.out.println(isPalindrome(234555432));
    }

    private static boolean isPalindrome(long data) {
        long temp = data;
        long newNum = 0;
        //temp = temp/10;
        int length = 0;
        while (temp > 0) {
            newNum = (newNum*10 ) + temp%10;
            temp = temp / 10;
        }
        return newNum==data;
        //System.out.println("le" + length);
        // 123
        // (3*10+2)*10+1
        //
//        int i = 1;
//        while (data > 9) {
//            //System.out.println("data % 10 " + (data % 10));
////            System.out.println("(int) Math.pow(10, length - i) " + (data / (int) Math.pow(10, length - i)));
//            if (data % 10 != data / (int) Math.pow(10, length - i)) {
//                return false;
//            }
//            i++;
//            data = data / 10; //  123211 12321
//
//            data = data % (int) Math.pow(10, length - i); // 12321 2321
////            System.out.println("data " + data);
//            i++;
//        }
//        return true;

        /*
         * 1
         * 2
         * 1
         *
         * 1
         * 2
         *
         * */


//        String s = String.valueOf(data);
//        for (int i = 0; i < s.length() / 2; i++) {
//            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
//                return false;
//            }
//        }
        //   return true;
    }
}
