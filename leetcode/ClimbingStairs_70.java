package leetcode;

public class ClimbingStairs_70 {

    /*
     *  1 2 3 4
     *  2 3 4
     *  1 3 4
     *  1 2 4
     *
     *
     *
     * */


    public static int climbStairs(int n) {
        int last = 1;
        int secondLast = 1;
        for (int i = 0; i < n - 1; i++) {
            int temp = secondLast;
            secondLast = last + secondLast;
            last = temp;
        }
        return secondLast;
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(3));
    }
}
