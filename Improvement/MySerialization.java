package Improvement;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by java3 on 21.08.17.
 */
public class MySerialization {

        void seric(ArrayList<String> list)  throws IOException {

            String path = "D:\\games\\serial\\temp.ser";

            MyObject myObject = new MyObject(list);

            File file = new File(path);

            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));
            try {
                out.writeObject(myObject);
            } catch (Exception e) {
            }

        }



//        ObjectInputStream iob = new ObjectInputStream(new FileInputStream(file));
//
//        try {
//            MyObject pp = (MyObject)(iob.readObject());
//            System.out.println(pp.getName());
//        }
//        catch (Exception e) {
//        }


//    }
}
