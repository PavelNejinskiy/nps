package Improvement;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by java3 on 17.08.17.
 */
public class MyFieScaner {

    static int counter = 0;
    static int i = 0;
    static String path = "D:\\games\\ForTest\\";
    ArrayList<String> list = new ArrayList<>();

    int scan(String word) throws IOException {
        //  int counter = 0;
        // String path = "/home/java3/test/";

        File dir = new File(path);

        counter = (directory(dir, word));
        return counter;
    }


    public int directory(File dir, String word) throws IOException {

        for (File file : dir.listFiles()) {

            if (file.isDirectory()) {
                directory(file, word);
            }

            if (!file.isDirectory()) {
             //   System.out.println("Берем в работу фаил: " + file.getAbsolutePath());

                if(file.getAbsolutePath().endsWith(".txt")){
                 //   System.out.println( "Этот фаил будем обрабатывать: " + file.getAbsolutePath());
                    counter = counter + read(file.getAbsolutePath(), word);
                }

            }
        }

        return counter;
    }

    public int read(String path, String word) throws IOException {

        BufferedReader fileReader = new BufferedReader(new FileReader(path));

        int counter = 0;

        try {

            String s;
            while ((s = fileReader.readLine()) != null) {

                if (s.contains(word)) {
                    counter++;
                   list.add(s);
                }

            }
        } finally {
            fileReader.close();
        }
        return counter;
    }


}
