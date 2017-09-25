package ProducerVSConsumer;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by pavel on 20/09/2017.
 */
public class Bank {

   static BlockingQueue<String> queue = new LinkedBlockingQueue<>();

    static int count = 0;

    public void setQueue(BlockingQueue<String> queue) {
        Bank.queue = queue;
    }

    public void setCount(int count) {
        Bank.count = count;
    }

    public int getCount() {return count;}

    public BlockingQueue<String> getQueue() {return queue;  }



}
