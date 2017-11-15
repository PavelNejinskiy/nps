package web2;

import org.jsoup.Jsoup;
import org.jsoup.select.Elements;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by pavel on 13/11/2017.
 */
public class Links {


    static List<URL> list = new ArrayList<URL>();

    public static List<URL> start(URL url)
    {
        Document doc;
        try {
            doc = Jsoup.connect(url.toString()).get();

            Elements urls = doc.body().getElementsByTag("a");

            for(Element link : urls)
            {
                list.add(new URL("\nhref Mayak <a> "+link.attr("href")));
               // System.out.println("\nhref Mayak <a> "+link.attr("href"));
            }
        } catch (IOException e) {}

        System.out.println(list.size());
        return list;
    }


}
