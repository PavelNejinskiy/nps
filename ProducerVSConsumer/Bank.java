package ProducerVSConsumer;

import java.io.File;
import java.util.concurrent.BlockingQueue;

/**
 * Created by pavel on 20/09/2017.
 */
public class Bank {

   static BlockingQueue<String> queue = null;

    static int count = 0;


    public void setQueue(BlockingQueue<String> queue) {
        Bank.queue = queue;
    }


    public void setCount(int count) {
        Bank.count = count;
    }

    public int getCount() {

        return count;
    }

    public BlockingQueue<String> getQueue() {

        return queue;
    }



}
