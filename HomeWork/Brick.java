package HomeWork;

/**
 * Created by мори on 04.07.2017.
 * 1. Написать класс, в котором будет метод, который проверяет,
 * сколькими сторонами кирпич пролезет через отверстие заданного диаметра (входные параметры - x, y, z кирпича и диаметр отверстия)
 */
public class Brick {

//   private int width;
//   private int height;
//   private int length;
//   private int diameter;

    public static int result(double x, double y, double z, double d) {

        int count = 0;

        if (Math.pow(d, 2) >= ((Math.pow(x, 2) + Math.pow(y, 2)))) {

            count++;
        }
        if (Math.pow(d, 2) >= (Math.pow(x, 2) + Math.pow(z, 2))) {

            count++;
        }
        if (Math.pow(d, 2) >= (Math.pow(y, 2) + Math.pow(z, 2))) {

            count++;
        }

        return count;
    }


}
