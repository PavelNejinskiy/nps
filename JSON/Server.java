package JSON;

import org.json.simple.JSONObject;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by pavel on 04/09/2017.
 */
public class Server {

    void server() throws IOException, ClassNotFoundException {
        ServerSocket serverSocket = new ServerSocket(8000);
        JSONObject obj = new JSONObject();

        Socket socket = serverSocket.accept();

        ObjectInputStream in = new ObjectInputStream(socket.getInputStream());

        while (true) {

            System.out.println("Server start");

            obj = (JSONObject) in.readObject();

            System.out.println("I take object");

            if (!obj.isEmpty()) { break;}
            }
        }
}
