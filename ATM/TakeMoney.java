package ATM;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by pavel on 15/08/2017.
 */
public class TakeMoney {

    void TakeMoney() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter summ");

        int col = Integer.parseInt(reader.readLine());

        DownloadMoney dm = new DownloadMoney();

     dm.download(col);



    }
}
