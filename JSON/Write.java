package JSON;

import org.json.simple.JSONObject;

import java.io.*;

/**
 * Created by pavel on 04/09/2017.
 */
public class Write {

    void write() throws IOException {
        File file = new File("D:\\games\\chJSON.json");
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));

        JSONObject obj = new JSONObject();

        obj.put("name", "foo");

        obj.put("num", new Integer(100));
        obj.put("balance", new Double(1000.21));
        obj.put("is_vip", new Boolean(true));


        writer.write(String.valueOf(obj));
        writer.flush();

//        StringWriter out = new StringWriter();
//        obj.writeJSONString(out);

//        String jsonText = out.toString();
//        System.out.print(jsonText);
    }
}

