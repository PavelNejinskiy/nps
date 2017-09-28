package ControlWorckThread;

/**
 * Created by java3 on 25.09.17.
 */
public class Matrix {

    int[][] createMatrix1() {
        int x = 100;
        int y = 100;

        int[][] matrix = new int[x][y];

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {

                matrix[i][j] = (int) (Math.random() * 100);

            }
        }
        return matrix;

    }


    int[][] createMatrix2() {

        int x = 100;
        int y = 100;

        int[][] matrix = new int[x][y];


        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {

                matrix[i][j] = (int) (Math.random()*5 +25);

            }
        }
        return matrix;

    }
}
