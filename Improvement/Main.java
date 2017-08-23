package Improvement;

import java.io.IOException;

/**
 * Created by java3 on 17.08.17.
 */
public class Main {

    public static void main(String[] args) throws IOException {

        ConsoleReader reader = new ConsoleReader();
        MyFieScaner scan = new MyFieScaner();


//       MyFileReader rd = new MyFileReader();
//        System.out.println(rd.read());

        while (true) {
            System.out.println("Enter word");
            System.out.println("For exit enter \"exit\"");

            String word = reader.read();

            if (word.equals("exit")) {break;}
            else {System.out.println(scan.scan(word)); }

        }

        for (int i = 0; i < scan.list.size(); i++) {
            System.out.println(scan.list.get(i));
        }

        MySerialization ser = new MySerialization();

        ser.seric(scan.list);

    }
}
