package Parser;

import java.io.*;

public class FileDataSource implements InterfaceParser {

    private File file;

    public synchronized void setFile(File file) {
        this.file = file;
    }

    public synchronized File getFile() {
        return file;
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
    @Override
    public String getContentWithoutUnicode() {

        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(file));
            String output = "";
            int data;
            while ((data = reader.read()) > 0) {
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
    @Override
    public void saveContent(String content)  {
        BufferedWriter bufferedWriter = null;

        try {
            bufferedWriter = new BufferedWriter(new FileWriter(file));

            if(content.length() > 0)
            {
                bufferedWriter.write(content);
                bufferedWriter.flush();
            }
        }
     catch (IOException ex) {
        System.out.println(ex.getMessage());

    }
    finally {
            try {
                bufferedWriter.close();
            } catch (IOException ex) {
                // log here
            }

        }

    }
}