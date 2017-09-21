package ProducerVSConsumer;

import java.io.*;
import java.util.Random;
import java.util.concurrent.BlockingQueue;

/**
 * Created by pavel on 20/09/2017.
 */
public class MyConsumer extends Thread {

    Bank bank = new Bank();
    int countLocal;

    char litera;

    public MyConsumer(char litera) {
        this.litera = litera;
    }

    @Override
    public void run() {

        System.out.println("test0");
        System.out.println(bank.getQueue().size());

        for (int i = 0; i < bank.getQueue().size(); i++) {
            try {
                System.out.println("test000");
                File file = new File(String.valueOf((bank.getQueue().take())));

                System.out.println("test1");
                BufferedReader reader = new BufferedReader(new FileReader(file));
                System.out.println("test2");
                String s = reader.readLine();
                while (s!=null) {
                    char[] ch = s.toCharArray();
                    for (int i1 = 0; i1 < ch.length; i1++) {
                        if (ch[i] == litera)
                        {
                            countLocal = bank.getCount();
                            bank.setCount(countLocal++);
                        }
                    }


                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
