package JSON;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

/**
 * Created by pavel on 04/09/2017.
 */
public class Read {

    JSONObject read() throws IOException, ParseException {
        JSONParser jsonParser = new JSONParser();
        JSONObject jsonObject = (JSONObject) jsonParser.parse(new FileReader("D:\\games\\chJSON.json"));

        System.out.println(jsonObject);
        return jsonObject;
    }



//    public static void main(String[] args) throws IOException, ParseException {

//        jSON();
//    }
}
