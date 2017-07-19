package HomeWork;

import java.util.Arrays;

/**
 * Created by мори on 05.07.2017.
 *
 2. Дан массив целых чисел (несортированный, с повторами). Найти три наименьших числа в нем. Возвращать массив размером 3 с этими числами.
 */
public class ArrayMin {

    public static int [] array ()
    {

        System.out.println("Task:  Дан массив целых чисел (несортированный, с повторами). Найти три наименьших числа в нем. Возвращать массив размером 3 с этими числами.");

        int [] mas = new int[14];
        int [] result = new int[3];
        double d;

        for (int i = 0; i < mas.length; i++) {

            d = Math.random()*10;
            mas[i] = (int) d;

        }

        System.out.print("Source array:  ");

        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }

        Arrays.sort(mas);



        System.out.println();

        for (int i = 0; i < result.length; i++) {
            result[i] = mas[i];
        }

        return result;

    }

}
