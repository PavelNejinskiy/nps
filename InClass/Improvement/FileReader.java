package Improvement;

import java.io.*;

/**
 * Created by java3 on 17.08.17.
 */
class MyFileReader implements MyIntarface {


    public String read() throws IOException {

        BufferedReader fileReader = new BufferedReader(new FileReader("/home/java3/ForTest.txt"));


        String line = fileReader.readLine();

        return line;

    }


}
