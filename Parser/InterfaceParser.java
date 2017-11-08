package Parser;


import java.io.File;

interface InterfaceParser {

    String getContent();

    public String getContentWithoutUnicode();

    public void saveContent(String content);
}
