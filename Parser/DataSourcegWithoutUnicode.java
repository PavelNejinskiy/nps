package Parser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by мори on 08.11.2017.
 */
public class DataSourcegWithoutUnicode extends DataSourceDecorator {


    public DataSourcegWithoutUnicode(InterfaceParser wrapper) {
        super(wrapper);
    }

    @Override
    public String getContent() {


            String output = super.getContent();
            String result = "";
        for (int i = 0; i < output.length(); i++) {
            int data = output.charAt(i);
            if (data < 0x80) {
                result += (char)data;
            }

        }
         return result;

    }
}
