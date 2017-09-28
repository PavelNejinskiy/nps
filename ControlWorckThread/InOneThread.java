package ControlWorckThread;

/**
 * Created by java3 on 25.09.17.
 */
public class InOneThread {


    int [][] rezult(int [][] matrix1, int [][] matrix2) {

        int m = matrix1.length;
        int n = matrix2[0].length;
        int o = matrix2.length;
        int[][] rezult = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < o; k++) {
                    rezult[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        return rezult;
    }

}
