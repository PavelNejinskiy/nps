package Improvement;

import java.io.IOException;

/**
 * Created by java3 on 17.08.17.
 */
public class Main {

    public static void main(String[] args) throws IOException {

        ConsoleReader reader = new ConsoleReader();

        String word = reader.read();

//       MyFileReader rd = new MyFileReader();
//        System.out.println(rd.read());

        MyFieScaner scan = new MyFieScaner();

        System.out.println(scan.scan(word));

    }
}
