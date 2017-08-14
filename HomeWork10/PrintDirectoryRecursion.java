package HomeWork10;

import java.io.File;

/**
 * Created by pavel on 14/08/2017.
 */
public class PrintDirectoryRecursion {

    static String counter = "-";

    public static void main(String[] args) {
        String path = "D:\\games";
        File dir = new File(path);
        printAllFilesFromDirectory(dir);
    }


    static void printAllFilesFromDirectory(File dir) {
        for (File file : dir.listFiles()) {
            print(file);
            if (file.isDirectory()) {
                counter += "-";
                printAllFilesFromDirectory(file);
            }
        }
        counter = counter.substring(counter.length() -1);
    }

    static void print(File file) {
        System.out.println(counter + " " + file.getName());
    }
}


