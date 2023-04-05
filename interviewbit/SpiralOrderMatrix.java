package interviewbit;

import java.util.ArrayList;
import java.util.List;

public class SpiralOrderMatrix {
    public static ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> A) {
        
        ArrayList<Integer> res = new ArrayList<Integer>();
        int direction = 1;
        int row = A.size();
        int col = A.get(0).size();

        int top=0;
        int right=col-1;
        int bottom=row-1;
        int left=0;

        while(top<=bottom && left<=right){
            if(direction==1){
                for (int i = left; i <= right; i++) {
                    res.add(A.get(top).get(i));
                }
                top++;
                direction=2;
            }
            else if(direction==2){
                for (int i = top; i <= bottom; i++) {
                    res.add(A.get(i).get(right));
                }
                right--;
                direction=3;
            }
            else if(direction==3){
                for (int i = right; i >= left; i--) {
                    res.add(A.get(bottom).get(i));
                }
                bottom--;
                direction=4;
            }
            else if(direction==4){
                for (int i = bottom; i >= top; i--) {
                    res.add(A.get(i).get(left));
                }
                left++;
                direction=1;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        
    }
}
