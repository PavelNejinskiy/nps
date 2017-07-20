package HomeWorkLesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by pavel on 20/07/2017.
 */
public class BoxMenu {

    public static void start() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s = "";

        while (true)
        {
            System.out.println("sum - press 1");
            System.out.println("delete - press 2");
            System.out.println("multiplication - press 3");
            System.out.println("division - press 4");
            System.out.println("avarage - press 5");
            System.out.println("size - press 6");
            System.out.println("For exit - press 0");
            System.out.println("");


            s = reader.readLine();

            if(s.equals("1")){Box.sum();}
            if(s.equals("2")){Box.delete();}
            if(s.equals("3")){Box.multiplication();}
            if(s.equals("4")){Box.division();}
            if(s.equals("5")){Box.avarage();}
            if(s.equals("6")){Box.size();}
            if(s.equals("0")){break;}


        }
    }

}
