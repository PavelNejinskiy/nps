package HomeWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by мори on 05.07.2017.
 */
public class MenuDeleteOneElement {

    public static void start() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Task:  Дан массив чисел. Написать метод, который удаляет число с конкретным индексом и возвращает новый массив без этого числа.");

        int[] mas = new int[20];
        int[] result = new int[19];
        double d;
        int x;

        for (int i = 0; i < mas.length; i++) {
            d = Math.random() * 10;
            mas[i] = (int) d;
        }

        System.out.print("Source array on 20 elements:  ");

        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
        System.out.println();

        System.out.print("Enter number 1 to 20:  ");

        x = Integer.parseInt(reader.readLine());

        System.out.println();
        System.out.println("Array after removing an element: ");

        result = DeleteOneElement.delete(mas, x);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

        System.out.println("");
        System.out.println("");

    }
}
