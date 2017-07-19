package HomeWork;

import java.util.Arrays;

/**
 * Created by мори on 08.07.2017.
 * 4. Написать класс, имплементирующий Comparable, в котором есть два целочисленных поля - месяц и день,
 * так, чтоб сначала сравнивались месяцы, потом дни. (Проверить потом можно через Arrays.parallelSort())
 */
public class ImpComparable {

    public static void start() {

        int[] arr1 = new int[12];
        int[] arr2 = new int[31];

        double d;

        for (int i = 0; i < arr1.length; i++) {

            d = Math.random() * 11 + 1;
            arr1[i] = (int) d;
        }

        for (int i = 0; i < arr2.length; i++) {

            d = Math.random() * 30 + 1;
            arr2[i] = (int) d;
        }

        Arrays.parallelSort(arr1);
        Arrays.parallelSort(arr2);

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
    }

    private class ForSort implements Comparable<ForSort> {
        int i;

        @Override
        public int compareTo(ForSort o) {
            return this.i - o.i;
        }
    }

}
