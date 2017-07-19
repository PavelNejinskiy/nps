package HomeWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by мори on 05.07.2017.
 */
public class MenuBrick {

    public static void start() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String num;
        double x;
        double y;
        double z;
        double d;

        System.out.println("Task: 1. Написать класс, в котором будет метод, который проверяет,\n" +
                " сколькими сторонами кирпич пролезет через отверстие заданного диаметра (входные параметры - x, y, z кирпича и диаметр отверстия)");
        System.out.println();
        System.out.println("Please enter input parameters - x, y, z bricks and hole diameter");

        System.out.print("enter x: ");
        x = Double.parseDouble(reader.readLine());

        System.out.print("enter y: ");
        y = Double.parseDouble(reader.readLine());

        System.out.print("enter z: ");
        z = Double.parseDouble(reader.readLine());

        System.out.print("enter diameter: ");
        d = Double.parseDouble(reader.readLine());

        System.out.println();

        System.out.println("The brick will climb through the hole of the specified diameter: " + Brick.result(x, y, z, d) + " side(s) ");
        System.out.println();
        System.out.println();

    }

}
