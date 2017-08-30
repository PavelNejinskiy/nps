package XML;

/**
 * Created by pavel on 29/08/2017.
 */
public class Main {

    public static void main(String[] args) {

        DOM dom = new DOM();
        StAX stAX = new StAX();

        dom.CreateXmlFileDom();
        stAX.CreateXMLStAX();
    }
}
