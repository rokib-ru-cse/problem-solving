package leetcode;

public class MaximumProductofTwoElementsinanArray_1464 {

    public int maxProduct(int[] arr) {
        int firstMax = -1;
        int secondMax = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > firstMax) {
                secondMax = firstMax;
                firstMax = arr[i];
            }
           else if (arr[i] > secondMax) {
                secondMax = arr[i];
            }
        }
        return (secondMax-1)*(firstMax-1);
    }

    public static void main(String[] args) {

    }
}
