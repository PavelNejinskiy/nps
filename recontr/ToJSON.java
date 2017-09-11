package recontr;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by java3 on 07.09.17.
 */
public class ToJSON {

    void writeToJSON(ArrayList<String> list) throws IOException {

        // File file = new File("/home/java3/test/Contrl/newfile.json");
        File file = new File("D:\\games\\chJSON.json");
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));


        JSONArray objArr = new JSONArray();
        JSONArray objArr2 = new JSONArray();

        ArrayList<String> listDiv = new ArrayList<>();
        ArrayList<String> listDiv2 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("");

        for (int i = 0; i < list.size(); i++) {
            String[] words = list.get(i).split(" ");

            for (int j = 0; j < words.length; j++) {
               // listDiv.add(words[j]);
                if (Character.isUpperCase(words[j].charAt(0))) {
                   listDiv.add(words[j]);
                }
                if (Character.isLowerCase(words[j].charAt(0))) {
                    listDiv2.add(words[j]);
                }
            }
        }

        objArr.add("uppercase:");
        objArr.addAll(listDiv);

        objArr2.add("lowercase:");
        objArr2.addAll(listDiv2);

        writer.write(String.valueOf(objArr));
        writer.write(String.valueOf(objArr2));
        writer.flush();


    }
}
