package Parser;

import java.io.File;
import java.io.IOException;

/**
 * Created by мори on 08.11.2017.
 */
public class DataSourceDecorator implements InterfaceParser {

    private InterfaceParser wrapper;

    protected File file;

    public DataSourceDecorator(File file) {
        this.file = file;
    }

    public DataSourceDecorator(InterfaceParser wrapper) {
        this.wrapper = wrapper;
    }

    @Override
    public String getContent() {
        return wrapper.getContent();
    }

    @Override
    public String getContentWithoutUnicode() {
        return wrapper.getContentWithoutUnicode();
    }

    @Override
    public void saveContent(String content) throws IOException {
            wrapper.saveContent(content);
    }
}
