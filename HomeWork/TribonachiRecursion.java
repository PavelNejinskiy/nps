package HomeWork;

import sun.util.calendar.Gregorian;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by мори on 08.07.2017.
 6. Написать программу, которая будет считать n-ный элемент последовательности
 Трибоначчи (каждый следующий элемент - сумма трех предыдущих). И циклом, и рекурсивно. Сравнить быстродействие.
 */
public class TribonachiRecursion {

    public static int fibonacciRecursion(int num) {
        if (num <= 0) {
            System.out.println("incorrect number");
            return 0;
        } else {
            if (num == 1) {
                return 1;
            }
            if (num == 2) {
                return 1;
            }
            if (num == 3) {
                return 1;
            }

            return fibonacciRecursion(num - 1) + fibonacciRecursion(num - 2) + fibonacciRecursion(num - 3);
        }

    }

    public static int fibonacciCycle(int num) {

        int n = num;
        int a = 1, b = 1, c = 1;

        if (num == 1) {
            return 1;
        }
        if (num == 2) {
            return 1;
        }
        if (num == 3) {
            return 1;
        }
        else {

            int fib = 0, i = 3;
            while (i < n) {
                fib = a + b + c;
                a = b;
                b = c;
                c = fib;
                i++;
            }

            return fib;
        }

    }

    public  static double getTime ()
    {
        Date date = new Date();
        return date.getTime();
    }

    public static void print(int x)
    {
        double d1;
        double d2;

        System.out.print("Input number: " + x  + " Recursion: ");

        d1 = getTime();

        System.out.print(fibonacciRecursion(x) + " Time: ");

        d2 = getTime();

        System.out.print((d2 - d1) +  " Cycle: ");

        d1 = getTime();

        System.out.print(fibonacciCycle(x));

        d2 = getTime();

        System.out.print(" Time: " + (d2 - d1));

        System.out.println();
    }



    public static void start() {

        System.out.println("Task:  Написать программу, которая будет считать n-ный элемент последовательности\n" +
                "    Трибоначчи (каждый следующий элемент - сумма трех предыдущих). И циклом, и рекурсивно. Сравнить быстродействие.");

        System.out.println();

        print(28);
        print(12);
        print(34);
        print(8);
        print(1);

        System.out.println();


    }

}
