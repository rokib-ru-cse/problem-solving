package interview;

public class CountThreeNumberSum {

    public static int countThreeNumberSum(int arr[], int sum) {
        return countThreeNumberSum(arr, sum, 0, 0);
    }

    private static int countThreeNumberSum(int[] arr, int sum, int index, int count) {
        return 0;
    }


    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};
        int sum = 6;

        System.out.println(countThreeNumberSum(arr, sum));

    }
}
