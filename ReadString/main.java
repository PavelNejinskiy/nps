package ReadString;

/**
 * Created by java3 on 11.09.17.
 */
public class main {

    public static void main(String[] args) throws InterruptedException {

        String line1 = "Morchella rufobrunnea, the blushing morel, is a sac fungus in the family Morchellaceae. " +
                "A prized edible species, the fungus was first described in 1998 by mycologists " +
                "Gastón Guzmán and Fidel Tapia from collections made in Veracruz, Mexico. Several DNA " +
                "studies have suggested that it is common in the West Coast of the United States, Israel, Australia, and Cyprus.";

        String line2 = "M. rufobrunnea differs from other Morchella species in its urban or " +
                "suburban habitat preferences, the color and form of the fruit body, the lack of a " +
                "sinus at the attachment of the cap with the stalk, the length of the pits on the " +
                "surface, and a brownish-orange or pinkish bruising reaction.";

        String line3 = "The Cassini–Huygens mission (probe rendering shown) to the Saturn system ends with a controlled fall into the atmosphere of the planet.";


        MyThreads tread1 = new MyThreads(line1);
        MyThreads tread2 = new MyThreads(line2);
        MyThreads tread3 = new MyThreads(line3);
       // MyThreads tread4 = new MyThreads("");

        WriteSet set = new WriteSet();

        tread1.start();
        tread2.start();
        tread3.start();
       // tread4.wait();

        Thread.sleep(2000);

        System.out.println(set.getSet().size());

    }
}
