package recontr;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by java3 on 07.09.17.
 */
public class Main {

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {

        ReadXMLConfig read = new ReadXMLConfig();

        ArrayList<String> list = read.readXML();
        ArrayList<String> list2 = new ArrayList<>();
        ///home/java3/test/Contrl for xml

        //System.out.println(read.readXML());

        String path = list.get(0);
        String extension = list.get(1);

        File file = new File(path);
       // System.out.println(path + "    " +  file);

        ReadFiles readFiles = new ReadFiles();

        list2 = readFiles.directory(file, extension);

        ToJSON toJSON = new ToJSON();

        toJSON.writeToJSON(list2);

    }


}
