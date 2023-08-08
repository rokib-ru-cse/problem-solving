package others;

public class FibonacchiSequence {


    private static void fibonacchiSequence1(int nth) {
        int first = -1;
        int second = 1;
        for (int i = 0; i < nth; i++) {
            System.out.print(first + second + " ");
            int temp = second;
            second = first + second;
            first = temp;
        }
        System.out.println();
    }

    private static int fibonacchiSequence2(int nth) {
        if (nth < 2) {
            return nth;
        }
        if (nth == 2) {
            return 1;
        }
        int fib = 0;
        fib = fibonacchiSequence2(nth - 1) + fibonacchiSequence2(nth - 2);
        System.out.print(fib + " ");
        return fib;
    }

    public static void main(String[] args) {
        fibonacchiSequence1(10);
        fibonacchiSequence2(4);
    }
}
