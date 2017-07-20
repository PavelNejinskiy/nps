package HomeWorkLesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by pavel on 19/07/2017.
 */
public class MenuForText {

    public static void textMenu() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s = "";

        while (true)
        {
            System.out.println("To change the date format - press 1 ");
            System.out.println("To view container properties - press 2 ");
            System.out.println("For stop - press 3 ");
            System.out.println("");

            s = reader.readLine();

            if(s.equals("1")) {FormatDate.start();}

            if(s.equals("2")) {BoxMenu.start();}

            if(s.equals("3")) {break;}

            if(!s.equals("1")&&!s.equals("2")&&!s.equals("3")){
                System.out.println("Please make the right choice.");
            }


        }



    }
}
