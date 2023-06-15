package leetcode;

public class Convert1DArrayInto2DArray_2022 {

    public int[][] construct2DArrayNested(int[] original, int m, int n) {

        if (original.length != (m * n)) {
            return new int[0][0];
        }

        int[][] res = new int[m][n];
        int k = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                res[i][j] = original[k++];
            }
        }
        return res;
    }

    public int[][] construct2DArray(int[] original, int m, int n) {

        if (original.length != (m * n)) {
            return new int[0][0];
        }

        int[][] res = new int[m][n];
        for (int k = 0; k < original.length; k++) {
            res[k/n][k % n] = original[k];
        }
        return res;
    }

    public static void main(String[] args) {

    }
}
