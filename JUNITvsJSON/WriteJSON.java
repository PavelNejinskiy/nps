package JUNITvsJSON;

import org.json.simple.JSONObject;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by pavel on 07/09/2017.
 */
public class WriteJSON {

    void write(JSONObject obj) throws IOException {
        File file = new File("D:\\games\\chJSON.json");
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));

      // JSONObject obj = new JSONObject();

//        obj.put("name", "foo");
//        obj.put("num", new Integer(100));
//        obj.put("balance", new Double(1000.21));
//        obj.put("is_vip", new Boolean(true));

       // obj.put(key, value);

        writer.write(String.valueOf(obj));
        writer.flush();
    }
}
