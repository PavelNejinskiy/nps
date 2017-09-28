package ControlWorckThread;

/**
 * Created by java3 on 25.09.17.
 */
public class Bank {

     int [][] matrix1;
     int [][] matrix2;
     int [][] rezult = new int[100][100];

    public void setRezult(int[][] rezult) {
        this.rezult = rezult;
    }

    public  int[][] getMatrix1() {
       // System.out.println(matrix1[0][0]);
        return matrix1;
    }

    public  int[][] getMatrix2() {
        return matrix2;
    }

    Matrix matr = new Matrix();

    void startCreat()
    {
        matrix1 = matr.createMatrix1();
        matrix2 = matr.createMatrix2();
    }
}
