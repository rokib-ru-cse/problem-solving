package Array;

/**
 * SecondSmallestNumberInAnArray
 */
public class SecondSmallestNumberInAnArray {
//    public static int secondSmallestNumberInAnArray(int[] arr) {
//
//        for (int i = 0; i < arr.length - 1; i++) {
//            for (int j = i; j < arr.length; j++) {
//                if (arr[j] < arr[i]) {
//                    int temp = arr[j];
//                    arr[j] = arr[i];
//                    arr[i] = temp;
//                }
//            }
//        }
//
//        return arr[1];
//    }

    public static int secondSmallestNumberInAnArraySecondWay(int[] arr) {

        int min1 = arr[0];
        int min2 = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min1) {
                min1 = arr[i];
            }
        }

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min2 && arr[i]>min1) {
                min2 = arr[i];
            }
        }

        System.out.println(min1);
        return min2;
    }
    public static int secondLargestNumberInAnArraySecondWay(int[] arr) {

        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min1) {
                min2= min1;
                min1 = arr[i];
            }
            else if(arr[i]<min2 && arr[i]!=min1){
                min2 = arr[i];
            }
        }

        return min2;
    }

    public static void main(String[] args) {
        //System.out.println(secondSmallestNumberInAnArray(new int[] { 1, 3, 7, 12, 9, 123, 44, 55 }));
//        System.out.println(secondSmallestNumberInAnArraySecondWay(new int[] { 1, 3, 7, 12, 9, 123, 44, 55 }));
        System.out.println(secondSmallestNumberInAnArraySecondWay(new int[]{4, 3, 6, 7, 8, 1}));
        System.out.println(secondLargestNumberInAnArraySecondWay(new int[] { 3,4,6,7,8,1}));
    }
}