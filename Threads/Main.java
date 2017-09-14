package Threads;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

//        createThriads tr1 = new createThriads("One");
//        createThriads tr2 = new createThriads("Two");
//        createThriads tr3 = new createThriads("Three");
//
//        tr1.start();
//        tr2.start();
//        tr3.start();

        User user1 = new User(55456, "Pavel", "+38063111111", "999");

        Converter converter = new Converter();
        converter.toJSON(user1);

    }
}
