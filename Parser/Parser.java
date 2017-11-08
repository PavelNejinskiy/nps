package Parser;


import java.io.File;

interface Parser {

    String getContent();

    public String getContentWithoutUnicode();

    public void saveContent(String content);
}
