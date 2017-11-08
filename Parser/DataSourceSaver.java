package Parser;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by мори on 08.11.2017.
 */
public class DataSourceSaver extends DataSourceDecorator {

    public DataSourceSaver(InterfaceParser wrapper) {
        super(wrapper);
    }

    public void saveContent(String content) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        for (int i = 0; i < content.length(); i += 1) {
            fileOutputStream.write(content.charAt(i));
        }
    }
}
