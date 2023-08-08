package others;

/**
 * TimePlanner
 */
public class TimePlanner {

    static int[] meetingPlanner(int[][] slotsA, int[][] slotsB, int dur) {
        // your code goes here
        int lengt=0;
        for(int[] arr1:slotsA){
          for(int[] arr2:slotsB){
            if(arr1[1]-arr1[0]>=dur&& arr2[1]-arr2[0]>=dur&& (Math.abs(arr2[1]-arr1[0])>=dur&&Math.abs(arr1[1]-arr2[0])>=dur)){
              int start = arr1[0]>arr2[0]?arr1[0]:arr2[0];
              return new int[]{start,start+dur};
            }
          }
        }
        return new int[0];
      }
      public static void main(String[] args){
        
      }
}