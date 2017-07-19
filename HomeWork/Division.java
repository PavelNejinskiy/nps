package HomeWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by мори on 08.07.2017.
 5. Найти частное и остаток от деления двух чисел используя только сложение и вычитание.
 */
public class Division {

    public static void start() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Task: Найти частное и остаток от деления двух чисел используя только сложение и вычитание.");

        System.out.println("Please enter two numbers (Divide the first number by the second): ");
        System.out.print("x: ");
        int x = Integer.parseInt(reader.readLine());
        System.out.println("");
        System.out.print("y: ");
        int y = Integer.parseInt(reader.readLine());

        int rez = x;
        int count = 0;

        while (rez > y)
        {
            rez = rez - y;
            count++;
        }

        System.out.println("Quotient: " + count);
        System.out.println("Remainder: " + rez);


    }
}
