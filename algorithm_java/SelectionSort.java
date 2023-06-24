import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SelectionSort {
    
    private static void selectionSort(int[] a){
        for (int i = 0; i < a.length-1; i++) {
            int min = a[i];
            int index=i;
            for (int j = i; j < a.length; j++) {
                if(a[j]<min){
                    min = a[j];
                    index = j;
                }
            }
            int temp = a[i];
            a[i] = min;
            a[index] = temp;   
        }
        for (int x = 0; x < a.length; x++) {
            System.out.print(a[x]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int range = in.nextInt();
        int[] a = new int[range];
        for (var i = 0; i < range; i++) {
            a[i] = in.nextInt();
        }
        selectionSort(a);
        in.close();
    }
}
