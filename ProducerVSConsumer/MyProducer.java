package ProducerVSConsumer;

import java.io.File;
import java.util.concurrent.BlockingQueue;

/**
 * Created by pavel on 20/09/2017.
 */
public class MyProducer extends Thread {

    File dir;

    String st = "D:\\games\\ForTest\\";

    public MyProducer(File dir) {
        this.dir = dir;
    }

    protected BlockingQueue<String> queue2 = null;



    Bank read = new Bank();

    @Override
    public void run() {
        File dir = new File(st);
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
//        while (!dir.isDirectory())
//        {
//
//        }
        read.setQueue(queue2);

        for (int i = 0; i < queue2.size(); i++) {
            try {
                System.out.println(queue2.take().indexOf(i));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
