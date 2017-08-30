package XML;

import java.io.*;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;

/**
 * Created by pavel on 29/08/2017.
 */
public class StAX {

    void CreateXMLStAX() {
        try {
            File file = new File("D:\\games\\chStAX.xml");
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));

            StringWriter stringWriter = new StringWriter();
            XMLOutputFactory xMLOutputFactory = XMLOutputFactory.newInstance();
            XMLStreamWriter xMLStreamWriter = xMLOutputFactory.createXMLStreamWriter(stringWriter);

            xMLStreamWriter.writeStartDocument();
            xMLStreamWriter.writeStartElement("channels");

            xMLStreamWriter.writeStartElement("ukraineChannels");
            xMLStreamWriter.writeAttribute("company", "1+1");

            xMLStreamWriter.writeStartElement("channelsName");
            xMLStreamWriter.writeAttribute("type", "SatelliteChannel");
            xMLStreamWriter.writeCharacters("1+1");
            xMLStreamWriter.writeEndElement();

            xMLStreamWriter.writeStartElement("channelsName");
            xMLStreamWriter.writeAttribute("type", "SatelliteChannel");
            xMLStreamWriter.writeCharacters("2+2");
            xMLStreamWriter.writeEndElement();

            xMLStreamWriter.writeStartElement("channelsName");
            xMLStreamWriter.writeAttribute("type", "CableChannel");
            xMLStreamWriter.writeCharacters("Tonis");
            xMLStreamWriter.writeEndElement();

            xMLStreamWriter.writeStartElement("channelsName");
            xMLStreamWriter.writeAttribute("type", "CableChannel");
            xMLStreamWriter.writeCharacters("TonisHD");
            xMLStreamWriter.writeEndElement();

            xMLStreamWriter.writeEndElement();
            xMLStreamWriter.writeEndDocument();

            xMLStreamWriter.flush();
            xMLStreamWriter.close();

            String xmlString = stringWriter.getBuffer().toString();

            writer.write(xmlString);
            writer.close();

            stringWriter.close();

            System.out.println(xmlString);

        } catch (XMLStreamException e) {
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
