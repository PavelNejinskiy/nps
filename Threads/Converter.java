package Threads;


import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Converter {

    private final static String baseFile = "D:\\games\\user.json";

    static File file = new File(baseFile);

    public static void toJSON(User user) throws IOException {
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.writeValue(file, user);
            System.out.println("json created!");
        } catch (IOException ex) {
           }
    }
//
//    public static User toJavaObject() throws IOException {
//        ObjectMapper mapper = new ObjectMapper();
//        return mapper.readValue(new File(baseFile), User.class);
//    }

}