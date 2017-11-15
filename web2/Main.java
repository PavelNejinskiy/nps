package web2;

import java.io.IOException;
import java.net.URL;
import java.util.List;

/**
 * Created by pavel on 15/11/2017.
 */
public class Main {

    public static void main(String[] args) throws IOException {

        Links links = new Links();

        List<URL> list =  links.start(new URL("http://www.tutorialspoint.com/"));

       // System.out.println(list.size());

        for (URL url : list) {
           System.out.println(url);
        }


    }
}
