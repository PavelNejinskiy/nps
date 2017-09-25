package ProducerVSConsumer;

import java.io.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by pavel on 25/09/2017.
 */
public class MyExecutorService extends Thread {

    Bank bank = new Bank();

    static int countLocal;
//    int count;
    File file;
    char litera;


    public MyExecutorService(char litera) {
        this.litera = litera;
    }


    void fabrica()
    {
        ExecutorService service = Executors.newFixedThreadPool(2);


        service.execute(new Runnable() {
            public void run() {

                String s = null;

                while (true){
                    try {
                        BufferedReader reader = new BufferedReader(new FileReader(bank.getQueue().take()));

                        while ((s = reader.readLine()) != null) {
                            char[] ch = s.toCharArray();

                            for (char c: ch) {

                                if (c == litera)
                                {  countLocal++;
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
                if (bank.getQueue().size() == 0) break;}
            }

        });    service.shutdown();


    }



}
