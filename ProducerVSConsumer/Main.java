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

    public static void main(String[] args) throws Exception {

        File dir = new File("D:\\games\\ForTest\\");

        char letter = 'a';

        Bank read = new Bank();

        MyProducer producer = new MyProducer(dir);
        producer.start();

       Thread.sleep(1000); // Без этого не работает ...

//        MyConsumer consumer1 = new MyConsumer(letter);
//        MyConsumer consumer2 = new MyConsumer(letter);
//        MyConsumer consumer3 = new MyConsumer(letter);
//        consumer1.start();
//        consumer2.start();
//        consumer3.start();


//        MyExecutorService myService = new MyExecutorService(letter);
//        myService.fabrica();

        MyCallable callable = new MyCallable(letter);
        callable.call();


        int i = 0;
        while(i < 5){
            System.out.println(read.count);
            i++;
            Thread.sleep(600);
        }

    }
}
