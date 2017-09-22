package ProducerVSConsumer;

import java.io.File;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by pavel on 20/09/2017.
 */
public class MyProducer extends Thread {

    File dir;

    public MyProducer(File dir) {
        this.dir = dir;
    }

    static BlockingQueue<String> queue2 = new LinkedBlockingQueue<>();

    Bank read = new Bank();

    @Override
    public void run() {
        File[] fList = dir.listFiles();

        for (File file : fList) {
                if (file.isFile()) {
                    try {
                        queue2.put(file.getAbsolutePath());
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
        }

        read.setQueue(queue2);

    }

    public BlockingQueue<String> getQueue() {
        return queue2;
    }
}
