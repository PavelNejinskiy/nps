package JSON;

import org.json.simple.JSONObject;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * Created by pavel on 04/09/2017.
 */
public class Client {

    void client (JSONObject jsonObject) throws IOException {

        int serverPort = 8000;
        String address = "127.0.0.1";

        InetAddress ipAddress = InetAddress.getByName(address);
        System.out.println("Any of you heard of a socket with IP address " + address + " and port " + serverPort + "?");
        Socket socket = new Socket(ipAddress, serverPort);
        System.out.println("Yes! I just got hold of the program.");

        InputStream sin = socket.getInputStream();
        OutputStream sout = socket.getOutputStream();

        // Конвертируем потоки в другой тип, чтоб легче обрабатывать текстовые сообщения.
        ObjectInputStream in = new ObjectInputStream(sin);
        ObjectOutputStream out = new ObjectOutputStream(sout);

        out.writeUTF(String.valueOf(jsonObject)); // отсылаем введенную строку текста серверу.
        out.flush(); // заставляем поток закончить передачу данных.

    }
}
