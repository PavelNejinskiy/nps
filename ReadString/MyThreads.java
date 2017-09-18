package ReadString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by java3 on 11.09.17.
 */
public class MyThreads extends Thread {

    String line;
    Lock lock = new ReentrantLock();
    WriteSet writeSet = new WriteSet();

    public MyThreads(String line) {
        this.line = line;
    }

    @Override
    public void run() {

        String[] words = line.split(" ");

        for (int i = 0; i < words.length; i++) {
            writeSet.addToSet(words[i]);
        }
    }


}
