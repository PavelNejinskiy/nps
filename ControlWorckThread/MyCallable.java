package ControlWorckThread;

import java.util.concurrent.Callable;

/**
 * Created by pavel on 29/09/2017.
 */
public class MyCallable implements Callable<Integer> {
    private int[] lineMatrix1;
    private int[] colomMatrix2;

    MyCallable(int[] line, int[] column) throws Exception {
        this.lineMatrix1 = line;
        this.colomMatrix2 = column;
    }

    public Integer call() {
        int rezult = 0;
        for (int i = 0; i < lineMatrix1.length; i++) {
            rezult += lineMatrix1[i] * colomMatrix2[i];
        }
        return rezult;
    }
}

