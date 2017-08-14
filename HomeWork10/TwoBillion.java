package HomeWork10;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by pavel on 14/08/2017.
 */
public class TwoBillion {
    private static final String FAIL = "D:\\games\\twobillion.txt";
    static String smbls = "0123456789abcdefghijklmnopqrstuvwxyz";
    static List<Character> list = new ArrayList();


    static void create(File file) {
        for (int i = 0; i < 20_000_000; i++) {
            int d = (int) (Math.random() * smbls.length() - 1);
            list.add(smbls.charAt(d));
        }
    }

    static void write() throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(FAIL));
        Character str;
        if (!FAIL.isEmpty()) {
            for (int i = 0; i < list.size() - 1; i++) {
                str = list.get(i);
                writer.write(str);
            }
            writer.flush();
            writer.close();
        }
    }

    static void readWithFileReader(File file) {
        long start, end;

        start = System.nanoTime();

        try (FileReader reader = new FileReader(FAIL)) {
            int c;
            while ((c = reader.read()) != -1) {
            }
        } catch (IOException ex) {
        }

        end = System.nanoTime();

        System.out.println("FileReader speed is " + (end - start) + " nanoSec");
    }

    static void readWithBuffer(File file) {
        long startBFR, endBFR;
        startBFR = System.nanoTime();

        try (BufferedReader reader = new BufferedReader(new FileReader(FAIL))) {
            String line;
            while ((line = reader.readLine()) != null) {
            }

        } catch (IOException ex) {
        }
        endBFR = System.nanoTime();
        System.out.println("BufferedReader speed is " + (endBFR - startBFR) + " nanoSec");
    }


    public static void main(String[] args) throws IOException {
        File file = new File(FAIL);
        create(file);
        write();

        readWithFileReader(file);
        System.out.println("");
        readWithBuffer(file);


    }
}
