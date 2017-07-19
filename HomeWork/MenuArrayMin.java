package HomeWork;

/**
 * Created by мори on 05.07.2017.
 */
public class MenuArrayMin {

    public static void start()
    {
        int [] array = new int[3];
        array = ArrayMin.array();

        System.out.print("Three minimal elements of an array: ");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();
        System.out.println();
    }
}
