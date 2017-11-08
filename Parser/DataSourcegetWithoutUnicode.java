package Parser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by мори on 08.11.2017.
 */
public class DataSourcegetWithoutUnicode extends FileDataSource {

     public DataSourcegetWithoutUnicode(InterfaceParser wrapper) {
        super(wrapper);
    }
    @Override
    public String getContent() {

        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(file));
            String output = "";
            int data;
            while ((output = reader.readLine()) != null) {
                data = reader.read();
                if (data < 0x80) {
                    output += output;
                }
            }
            return output;
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            return "Error";
        }
    }
}
