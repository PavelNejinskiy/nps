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
        MyProducer pr = new MyProducer(new File("D:\\games\\ForTest\\"));
       for (int i = 0; i < pr.getQueue().size(); i++) {
            try {
                BufferedReader reader = new BufferedReader(new FileReader(pr.getQueue().take()));

                while ((s = reader.readLine()) != null) {
                    char[] ch = s.toCharArray();

                    for (char c: ch) {
                      //  System.out.print(c);
                        if (c == litera)
                        {  countLocal++;
                          // System.out.println(countLocal);
                           // countLocal = bank.getCount();
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
