package XML;


import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import java.io.File;

/**
 * Created by pavel on 29/08/2017.
 */
public class DOM {

       void CreateXmlFileDom(){

            try {
                DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
                DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
                Document doc = dBuilder.newDocument();

                // root element
                Element rootElement = doc.createElement("channels");
                doc.appendChild(rootElement);

                // supercars element
                Element channels = doc.createElement("ukraineChannels");
                rootElement.appendChild(channels);

                // setting attribute to element
                Attr attr = doc.createAttribute("company");
                attr.setValue("1+1");
                channels.setAttributeNode(attr);

                // chname element
                Element chname1 = doc.createElement("channelsName");
                Attr attrType1 = doc.createAttribute("type");
                attrType1.setValue("SatelliteChannel");
                chname1.setAttributeNode(attrType1);
                chname1.appendChild(doc.createTextNode("1+1"));
                channels.appendChild(chname1);

                Element chname2 = doc.createElement("channelsName");
                Attr attrType2 = doc.createAttribute("type");
                attrType2.setValue("SatelliteChannel");
                chname2.setAttributeNode(attrType2);
                chname2.appendChild(doc.createTextNode("2+2"));
                channels.appendChild(chname2);

                Element chname3 = doc.createElement("channelsName");
                Attr attrType3 = doc.createAttribute("type");
                attrType3.setValue("CableChannel");
                chname3.setAttributeNode(attrType3);
                chname3.appendChild(doc.createTextNode("Tonis"));
                channels.appendChild(chname3);

                // write the content into xml file
                TransformerFactory transformerFactory = TransformerFactory.newInstance();
                Transformer transformer = transformerFactory.newTransformer();
                DOMSource source = new DOMSource(doc);
                StreamResult result = new StreamResult(new File("D:\\games\\chDOM.xml"));
                transformer.transform(source, result);

                // Output to console for testing
                StreamResult consoleResult = new StreamResult(System.out);
                transformer.transform(source, consoleResult);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

}
