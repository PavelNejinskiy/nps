package JSON;

import org.json.simple.parser.ParseException;

import java.io.IOException;

/**
 * Created by pavel on 04/09/2017.
 */
public class Main {

    public static void main(String[] args) throws IOException, ParseException, ClassNotFoundException {

//        Write obj = new Write();
//        obj.write();
//
        Read read = new Read();


        Server server = new Server();
        server.server();

        Client client = new Client();
        client.client(read.read());

    }
}
