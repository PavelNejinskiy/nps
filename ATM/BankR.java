package ATM;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by pavel on 11/10/2017.
 */
public class BankR {

   private static Map<Integer, Integer>   note = new LinkedHashMap<>();

    public void setNote(int key, int note) {

        this.  note.put(key, note);
    }

    public Map getNote() {

        return note;
    }

    void addMoneyInBankomat()
    {
        note.put(500, 100);
        note.put(200, 100);
        note.put(100, 100);
        note.put(50, 100);
        note.put(20, 100);
        note.put(10, 100);
        note.put(5, 100);
        note.put(2, 100);
        note.put(1, 100);
    }
}
