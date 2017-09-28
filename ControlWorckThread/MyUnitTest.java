package ControlWorckThread;

import org.junit.Test;

/**
 * Created by pavel on 27/09/2017.
 */
public class MyUnitTest {

    @Test
    public void testValidationMatrix(){
        Matrix matrix = new Matrix();

        int mx1Line = matrix.createMatrix1()[0].length;
        int mx2Line = matrix.createMatrix2()[0].length;
        int mx1Column = matrix.createMatrix2()[1].length;
        int mx2Column = matrix.createMatrix2()[1].length;

        if (mx1Line == mx1Column) {
            System.out.println("True");
        }
        if (mx2Line == mx2Column) {
            System.out.println("True");
        }
    }


    @Test
    public void testCreateInOneYhread (){
        Matrix matrix = new Matrix();

        int[][] mx1 = matrix.createMatrix1();
        int[][] mx2 = matrix.createMatrix2();

        InOneThread one = new InOneThread();

        one.rezult(mx1, mx2);
    }

    @Test
    public void testCreateMatrix(){
        Matrix matrix = new Matrix();

        int[][] mx1 = matrix.createMatrix1();
        int[][] mx2 = matrix.createMatrix2();


    }
}
