package algorithm_java;

import java.util.Arrays;

public class BinarySearch {


    private static int binarySearch1(int arr[], int value) {
        Arrays.sort(arr);
        return binarySearch1Helper(arr, 0, arr.length - 1, value);
    }

    private static int binarySearch1Helper(int[] arr, int low, int high, int value) {
        int mid = (low + high) / 2;
        if (low > high) {
            return 0;
        }
        if (arr[mid] == value) {
            return value;
        } else if (value < arr[mid]) {
            return binarySearch1Helper(arr, low, mid - 1, value);
        } else {
            return binarySearch1Helper(arr, mid + 1, high, value);
        }
    }

    private static int binarySearch2(int arr[], int value) {
        Arrays.sort(arr);
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == value) {
                return value;
            } else if (value < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(binarySearch1(new int[]{1, 2, 3, 4, 5, 6, 7}, 44));
        System.out.println(binarySearch2(new int[]{1, 2, 3, 4, 5, 6, 7}, 4));
    }
}
