package ATM;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by pavel on 15/08/2017.
 */
public class DownloadMoney {

    BankR bank = new BankR();

    Map<Integer, Integer> cup = new HashMap();

    int [] mass = new int[9];

   void download(int col) {

        int temp = 0;
        int summ = col;
        int count = 0;

        Iterator it = bank.getNote().entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry) it.next();


            if (summ / (Integer) pair.getKey() > 0 && (Integer) pair.getValue() > summ / (Integer) pair.getKey()) {
                temp = summ / (Integer) pair.getKey();
                bank.setNote((Integer) pair.getKey(), (int) pair.getValue() - temp);
                summ = summ - temp * (Integer) pair.getKey();

                mass[count] = temp;
            }
            count++;
        }
       for (int i = 0; i < mass.length; i++) {
           System.out.println(mass[i]);
       }
    }


}
