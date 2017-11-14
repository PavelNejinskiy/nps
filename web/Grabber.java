package web;

import com.sun.webkit.WebPage;
import org.jsoup.Jsoup;
import org.jsoup.select.Elements;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by pavel on 13/11/2017.
 */
public class Grabber {

    public static void startGraber()
    {
        try {
            Document doc = Jsoup.connect("http://www.tutorialspoint.com/").get();
            Element mBody = doc.body();
            String name = doc.title();
            System.out.println("Name of page html: " + name);

            Elements urls = doc.body().getElementsByTag("a");
            for(Element url : urls)
            {
                
                System.out.println("\nhref Mayak <a> "+url.attr("href"));

            }
        } catch (IOException e) {}
    }



    public static void main(String[] args) throws IOException {

        Grabber grabber = new Grabber();

       grabber.startGraber();

    }
}
