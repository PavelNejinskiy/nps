package JUNITvsJSON;

import JSON.Client;
import JSON.Read;
import JSON.Server;
import org.json.simple.parser.ParseException;

import java.io.IOException;

/**
 * Created by pavel on 05/09/2017.
 */
public class Main {

    public static void main(String[] args) throws IOException, ParseException {

//        WriteJSON obj = new WriteJSON();
//        obj.write();

        ReadJSON read = new ReadJSON();
        System.out.println(read.read());

    }
}
