package recontr;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by java3 on 07.09.17.
 *
 *
 */
public class ReadFiles {

        public ArrayList<String> directory(File dir, String word) throws IOException {

            System.out.println(dir);
            System.out.println(word);

            ArrayList<String> list = new ArrayList<>();

            String s = "";

            for (File file : dir.listFiles()) {

                if (!file.isDirectory()) {

                    if (file.getName().toLowerCase().endsWith(word)) {
                        BufferedReader fileReader = new BufferedReader(new FileReader(file));
                        while ((s = fileReader.readLine()) != null) {
                            list.add(s);
                        }
                    }
                }
            }
            return list;
        }


}
