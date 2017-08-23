package Improvement;

import java.io.*;
import java.util.ArrayList;

import static java.lang.System.in;
import static java.lang.System.out;

/**
 * Created by java3 on 21.08.17.
 */
public class MyObject implements Serializable {

    ArrayList<String> list;

    public MyObject(ArrayList<String> list) {
        this.list = list;
    }

        public void writeExternal (ObjectOutput out) throws IOException {
            out.writeObject(list);
        }

        public void readExternal (ObjectInput in) throws IOException,
                ClassNotFoundException {
            list = (ArrayList<String>) in.readObject();
        }

}
