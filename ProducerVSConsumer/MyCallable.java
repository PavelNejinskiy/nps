package ProducerVSConsumer;

import java.io.*;
import java.util.concurrent.Callable;

/**
 * Created by pavel on 25/09/2017.
 */
public class MyCallable implements Callable {


    Bank bank = new Bank();

    static int countLocal;
    File file;
    char litera;


    public MyCallable(char litera) {
        this.litera = litera;
    }


    @Override
    public Object call() throws Exception {

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

        return null;
    }
}
