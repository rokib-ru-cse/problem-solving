package others;

/**
 * MoveZerosToEnd
 */
public class MoveZerosToEnd {

    public static int[] moveZerosToEndWithoutExtraSpace(int[] arr){
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[count++] = arr[i];
            }
        }
        for(int i=count;i<arr.length;i++){
            arr[i] = 0;
        }
        return  arr;
    }

    public static int[] moveZerosToEndWithExtraSpace(int[] arr){
        int count = 0;
        int[] res = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                res[count++] = arr[i];
            }
        }
        for(int i=count;i<arr.length;i++){
            res[i] = 0;
        }
        return  res;
    }

    public static void main(String[] args){
        for(int a:moveZerosToEndWithoutExtraSpace(new int[]{1,2,0,3,0,0,6,9})){
            System.out.print(a+" ");
        }
        System.out.println();
        for(int a:moveZerosToEndWithExtraSpace(new int[]{1,2,0,3,0,0,6,9})){
            System.out.print(a+" ");
        }
    }
}