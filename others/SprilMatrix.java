/**
 * SprilMatrix
 */
public class SprilMatrix {



    public static void main(String[] args) {
        int[][] arr = new int[][]{{1,2,3,4,5},{5,6,7,8,6},{9,10,11,12,7},{13,14,15,16,8}};
        int row=arr.length;
        int col=arr[0].length;

        int direction=1;
        int top=0;
        int right = col-1;
        int bottom = row-1;
        int left = 0;
        while(top<=bottom && left<=right){
            if(direction==1){
                for (int i = left; i <= right; i++) {
                    System.out.print(arr[top][i]+" ");
                }
                direction=2;
                top++;
            }else if(direction==2){
                for (int i = top; i <= bottom; i++) {
                    System.out.print(arr[i][right]+" ");
                }
                direction=3;
                right--;
            }else if(direction==3){
                for (int i = right; i >= left; i--) {
                    System.out.print(arr[bottom][i]+" ");
                }
                direction=4;
                bottom--;
            }else if(direction==4){
                for (int i = bottom; i >= top; i--) {
                    System.out.print(arr[i][left]+" ");
                }
                direction=1;
                left++;
            }
        }
        
    }
}