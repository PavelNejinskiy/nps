package HomeWorkLesson6;

import java.time.LocalDate;

/**
 * Created by pavel on 19/07/2017.
 */
public class FormatDate {

    public static void start()
    {
        LocalDate date = LocalDate.of(2017, 7, 17);

        // Output must be 17 July 2017

        System.out.println(String.format("%1$te  %tB %1$tY", date));
        System.out.println("");
    }
}
