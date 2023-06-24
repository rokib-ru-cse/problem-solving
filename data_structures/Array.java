public class Array {

    private int[] arr = new int[2];

    public void printArray() {
        for (int i = 0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public int[] removeEvenInt(int[] arr) {
        int result[] = new int[arr.length];
        for (int i = 0, j = 0; arr[i] != 0; i++) {
            int k = arr[i] & 1;
            if (k == 1) {
                result[j] = arr[i];
                j++;
            }
        }
        return result;
    }

    public int[] reverseArray(int[] arr) {
        int start = 0, end = 0, temp;
        for (; arr[end] != 0; end++) {
        }
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end - 1];
            arr[end - 1] = temp;
            start++;
            end--;
        }
        return arr;
    }

    public int minimumElement(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; arr[i] != 0; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public int maximumElement(int[] arr) {
        int max = 0;
        for (int i = 0; arr[i] != 0; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public int SecondMaximumElement(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; arr[i] != 0; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax) {
                secondMax = arr[i];
            }
        }
        return secondMax;
    }
    public int[] resizeArray(int[] arr){
        int[] newArray = new int[arr.length+10];
        for (int i = 0;i<arr.length; i++) {
            newArray[i] = arr[i];
        }
        return newArray;
    }

    public boolean isPalindrome(String word){
        char[] charArray = word.toCharArray();
        int start = 0;
        int end = charArray.length-1;
        while(start<end){
            if(charArray[start]!=charArray[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        Array obj = new Array();
        System.out.println(obj.arr.length);
        obj.arr[0] = 3;
        obj.arr[1] = 5;
        obj.arr = obj.resizeArray(obj.arr);
        obj.arr[2] = 6;
        obj.arr[3] = 7;
        obj.arr[4] = 4;
        obj.printArray();
        obj.arr = obj.removeEvenInt(obj.arr);
        obj.printArray();
        obj.arr = obj.reverseArray(obj.arr);
        obj.printArray();
        System.out.println("minimum element  = " + obj.minimumElement(obj.arr));
        System.out.println("maximum element  = " + obj.maximumElement(obj.arr));
        System.out.println("Second Maximum element  = " + obj.SecondMaximumElement(obj.arr));
        if(obj.isPalindrome("mama")){
            System.out.println("mama is palindrome");
        }else{
            System.out.println("mama not is palindrome");
        }
    }
}
