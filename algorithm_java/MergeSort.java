// import java.util.Scanner;

// public class MergeSort {
//     private static int range ;
//     private static int[] a = new int[range];
//     public static void mergeSort(int low,int hight){
//         if(low==hight){
//             return;
//         }
//         int mid = (low+hight)/2;
//         mergeSort(low,mid);
//         mergeSort(mid+1,hight);
//         merge(low,hight,mid);
//     }
//     public static void merge(int low,int hight,int mid){

//     }
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         range = in.nextInt();
//         for (var i = 0; i < range; i++) {
//             a[i] = in.nextInt();
//         }
//         int low = 0;
//         int hight = range-1;
//         mergeSort(low,hight);
//         in.close();
//     }
// }