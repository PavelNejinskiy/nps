package recontr;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by java3 on 07.09.17.
 */
public class TestContrlWork {


    @Test
    public void test1() throws IOException {
        ReadFiles readFiles = new ReadFiles();

        //String dir = "/home/java3/IdeaProjects/HillelNPS/src/main/java/ControlWorkIn/";
        String dir = "D:\\games\\ForTest";

        File file = new File(dir);

        readFiles.directory(file, "txt");
    }


    @Test
    public void test2() throws IOException {
        ToJSON toJSON = new ToJSON();

        ArrayList<String> list = new ArrayList<>();

        list.add("AAAA");
        list.add("BBB");
        list.add("ggggg");
        list.add("hhhhh");
        list.add("HHHH");

        toJSON.writeToJSON(list);


    }

    @Test
    public void test3() throws IOException {
        ToJSON toJSON = new ToJSON();

        toJSON.writeToJSON(null);
    }
}
