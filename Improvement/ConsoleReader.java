package Improvement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by java3 on 17.08.17.
 */
public class ConsoleReader implements MyIntarface {



    public String read() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

       return reader.readLine();

    }

}
