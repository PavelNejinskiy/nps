import java.io.*;

public class Parser {
    private File file;

    public synchronized void setFile(File file) {
        file = file;
    }

    public synchronized File getFile() {
        return file;
    }

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

    public String getContentWithoutUnicode() throws IOException {

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

    public void saveContent(String content) throws IOException {
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