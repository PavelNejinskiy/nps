package recontr;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;


/**
 * Created by java3 on 07.09.17.
 */
public class ReadXMLConfig {

    static ArrayList<String> readXML() throws IOException, ParserConfigurationException, SAXException {

        ArrayList<String> path = new ArrayList<>();

       // File inputFile = new File("/home/java3/IdeaProjects/HillelNPS/src/main/java/ControlWorkIn/conf.xml");
        File inputFile = new File("C:\\Users\\pavel\\IdeaProjects\\untitled2\\src\\recontr\\conf.xml");

        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(inputFile);

        doc.getDocumentElement().normalize();

        NodeList nodes = doc.getElementsByTagName("configuration");


        for (int i = 0; i < nodes.getLength(); i++) {
            Node node = nodes.item(i);

            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) node;
                String dir = element.getElementsByTagName("directory").item(0).getTextContent();
                path.add(dir);

                String file = element
                        .getElementsByTagName("extension")
                        .item(0)
                        .getTextContent();
                path.add(file);
            }

       }

       return path;
    }
}
