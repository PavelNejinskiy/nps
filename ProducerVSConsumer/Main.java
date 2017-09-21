package ProducerVSConsumer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Created by pavel on 20/09/2017.
 */
public class Main {

    static BlockingQueue<String> queue = null;

    public static void main(String[] args) throws FileNotFoundException, InterruptedException {

         BlockingQueue<String> bQ = new ArrayBlockingQueue<String>(10);

        File dir = new File("D:\\games\\ForTest\\");

        char letter = 'n';

        Bank read = new Bank();

        MyProducer producer = new MyProducer(dir);
        producer.start();

//        Thread.sleep(5000);

//        MyConsumer consumer1 = new MyConsumer(litera);
//        MyConsumer consumer2 = new MyConsumer(litera);
//        consumer1.start();
//        consumer2.start();

        System.out.println(read.getCount());

    }
}
