package HomeWork;

/**
 * Created by мори on 05.07.2017.
 3. Дан массив чисел. Написать метод, который удаляет число с конкретным индексом и возвращает новый массив без этого числа.
 */
public class DeleteOneElement {

    public static int [] delete (int[] mas, int x)
    {
        int [] result = new int[mas.length - 1];
        int f = 0;

        for (int i = 0; i < mas.length; i++) {

            if( i != x - 1) {
                result[f] = mas[i];
                f++;
            }


        }

        return result;
    }
}
