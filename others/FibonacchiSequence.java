package others;

import java.util.stream.Stream;

public class FibonacchiSequence {


    private static void fibonacchiSequence1(int nth) {
        int first = 0;
        int second = 1;
        for (int i = 0; i < nth; i++) {
            System.out.print(first + " ");
            int sum = first + second;
            first = second;
            second = sum;
        }
        System.out.println();
    }

    private static void fibonacchiSequence2(int nth) {
        for (int i = 0; i < nth; i++) {
            System.out.print(fibonacchiHelper(i) + " ");
        }
        System.out.println();
    }

    private static int fibonacchiHelper(int value) {
        if (value <= 1) {
            return value;
        }
        return fibonacchiHelper(value - 1) + fibonacchiHelper(value - 2);
    }

    private static void fibonacchiSequence3(int nth) {
        int[] fib = new int[nth];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i < nth; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        for (int value : fib) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    private static void fibonacchiSequence4(int nth) {
        Stream.iterate(new int[]{0, 1}, fib -> new int[]{fib[1], fib[0] + fib[1]})
                .limit(nth)
                .mapToInt(fab -> fab[0])
                .forEach(num -> System.out.print(num + " "));
        System.out.println();
    }

    public static void main(String[] args) {
        fibonacchiSequence1(10);
        fibonacchiSequence2(10);
        fibonacchiSequence3(10);
        fibonacchiSequence4(10);
    }
}
