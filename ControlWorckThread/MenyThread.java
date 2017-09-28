package ControlWorckThread;

import java.util.concurrent.Callable;


/**
 * Created by java3 on 25.09.17.
 */
public class MenyThread implements Callable {

    public MenyThread(int i, int j) {
        this.i = i;
        this.j = j;
    }

    int i;
    int j;

    @Override
    public Integer call() throws Exception {

        return i*j;
    }

}
