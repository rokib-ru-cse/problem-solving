package Array;

import java.util.Arrays;

public class FindTheMedian {

    private static int findTheMedian1(int[] arr) {
        Arrays.sort(arr);
        if (arr.length % 2 == 0) {
            return (arr[(arr.length - 1) / 2] + arr[arr.length / 2]) / 2;
        } else {
            return arr[arr.length / 2];
        }
    }
    private static int findTheMedian2(int[] arr) {
        int counter = arr.length;
        for (int i = 0; i < arr.length; i++) {
            
        }
        if (arr.length % 2 == 0) {
            return (arr[(arr.length - 1) / 2] + arr[arr.length / 2]) / 2;
        } else {
            return arr[arr.length / 2];
        }
    }

    public static void main(String[] args) {
        System.out.println(findTheMedian1(new int[]{4, 6, 3, 8, 9}));
    }
}
