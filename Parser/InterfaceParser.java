package Parser;


import java.io.File;
import java.io.IOException;

interface InterfaceParser {

    String getContent();

    public String getContentWithoutUnicode();

    public void saveContent(String content) throws IOException;
}
