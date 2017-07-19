package HomeWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by мори on 04.07.2017.
 */
public class CommonMenu {

    public static void menu() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String num;

        while (true) {
            System.out.println("task 1 - press 1");
            System.out.println("task 2 - press 2");
            System.out.println("task 3 - press 3");
            System.out.println("task 4 - press 4");
            System.out.println("task 5 - press 5");
            System.out.println("task 6 - press 6");

            num = reader.readLine();

            if (num.equals("1")) {

                MenuBrick.start();
            }

            if (num.equals("2")) {

                MenuArrayMin.start();
            }

            if (num.equals("3")) {

                MenuDeleteOneElement.start();
            }

            if (num.equals("4")) {

                ImpComparable.start();
            }

            if (num.equals("5")) {

                Division.start();
            }

            if (num.equals("6")) {

                TribonachiRecursion.start();
            }

        }
    }

}
