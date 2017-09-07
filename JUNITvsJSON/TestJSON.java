package JUNITvsJSON;

import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.junit.Test;

import java.io.IOException;

/**
 * Created by pavel on 07/09/2017.
 */
public class TestJSON {

    @Test
    public void test1() throws IOException {

        JSONObject obj = new JSONObject();
        WriteJSON write = new WriteJSON();

        obj.put("key1", "value1");
        obj.put("key2", "value2");
        obj.put("key3", "value3");
        obj.put("key4", "value4");

        write.write(obj);
    }


    @Test
    public void test2() {
        ReadJSON read = new ReadJSON();

        try {
            System.out.println(read.read());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test3() throws IOException, ParseException {

        JSONObject obj = new JSONObject();
        WriteJSON write = new WriteJSON();

        obj.put("key1", "value1");
        obj.put("key2", "value2");
        obj.put("key3", "value3");
        obj.put("key4", "value4");

        write.write(obj);

        ReadJSON read = new ReadJSON();

        try {
            System.out.println(read.read());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.println(read.read().equals(obj));

    }



}
