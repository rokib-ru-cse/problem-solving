package interview;

public class FindSingleElement {

    public static int findSingleElement(int[] arr){
        int single = 0;
        for (int i = 0; i < arr.length; i++) {
            single = single^arr[i];
        }
        return single;
    }

    public static void main(String[] args) {
        System.out.println(findSingleElement(new int[]{1,2,2,1,4}));
    }
}
