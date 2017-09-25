package ProducerVSConsumer;

import java.io.*;


/**
 * Created by pavel on 20/09/2017.
 */
public class MyConsumer extends Thread {

    Bank bank = new Bank();
   static int countLocal;
    int count;

    public int getCount() {
        this.count = countLocal;
        return this.count;
    }

    char litera;

    public MyConsumer(char litera) {
        this.litera = litera;
    }

    @Override
    public void run() {
        String s = null;

       for (int i = 0; i < bank.getQueue().size(); i++) {
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
       }

    }
}
