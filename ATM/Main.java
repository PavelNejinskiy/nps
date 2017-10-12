package ATM;

import java.io.IOException;

/**
 * Created by pavel on 15/08/2017.
 */
public class Main {

    public static void main(String[] args) throws IOException {

        BankR bankR = new BankR();

        bankR.addMoneyInBankomat();

        TakeMoney take = new TakeMoney();

        take.TakeMoney();

    }
}
