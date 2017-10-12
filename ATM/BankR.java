package ATM;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by pavel on 11/10/2017.
 */
public class BankR {

   private static Map<Integer, Integer> money = new HashMap();

    public void setMoney(int key, int money) {

        this.money.put(key, money);
    }

    public Map getMoney() {

        return money;
    }

    void addMoneyInBankomat()
    {
      money.put(500, 100);
      money.put(200, 100);
      money.put(100, 100);
      money.put(50, 100);
      money.put(20, 100);
      money.put(10, 100);
      money.put(5, 100);
      money.put(2, 100);
      money.put(1, 100);
    }
}
