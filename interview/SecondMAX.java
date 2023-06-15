package interview;

public class SecondMAX {


    public static int secondMAX(int[] arr) {

        int firstMax = -1;
        int secondMax = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > firstMax) {
                firstMax = arr[i];
            } else if (arr[i] > secondMax && arr[i]<firstMax) {
                if (){
                    secondMax = arr[i];
                }else {
                    secondMax = arr[i];
                }
            }

        }
        return secondMax;
    }

    public static void main(String[] args) {
        System.out.println(secondMAX(new int[]{1, 4, 2, 5, 7, 9, 12, 11,13}));
    }
}
