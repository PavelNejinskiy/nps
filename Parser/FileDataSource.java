package Parser;

import java.io.*;

public class FileDataSource extends DataSourceDecorator {

    private File file;

    public FileDataSource(File file) {
        super(file);
        this.file = file;
    }

  @Override
  public String getContent() {
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(file));
            String output = "";
            while ((output = reader.readLine()) != null) {
                output += output;
            }
            return output;
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            return "Error";
        }
    }

}