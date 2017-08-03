package HomeWorkFrom3107;

/**
 * Created by pavel on 02/08/2017.
 */
public class Main {

    public static void main(String[] args) throws BoxException {

        Box gg = new Box(0);
        try {
            gg.add(25);
            gg.add(5);
            System.out.println(gg.get());
        } catch (BoxException ex) {
            System.out.println("The collection capacity is less than or equal zero");
        }

        Box gg1 = new Box(7);

        gg1.add(5);
        gg1.add(25);
        gg1.add(8);
        gg1.add(9);
        gg1.add(7);
        gg1.add(10);
        gg1.add(11);

        System.out.println(gg1.get());

        Box gg2 = new Box(0);

            gg2.add(25);
            gg2.add(5);
        System.out.println(gg2.get());

    }
}
