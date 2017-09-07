package JUNITvsJSON;

import org.junit.Test;

/**
 * Created by pavel on 05/09/2017.
 */
public class TestSortMassForLenght {

    @Test
    public void test1() {
        SortMassForLenght sort = new SortMassForLenght();

        String[] mass = new String[10];
        String[] mass2 = new String[10];

        mass[9] = "a";
        mass[8] = "aa";
        mass[7] = "aaa";
        mass[6] = "aaaa";
        mass[5] = "aaaaa";
        mass[4] = "aaaaaa";
        mass[3] = "aaaaaaa";
        mass[2] = "ssss";
        mass[1] = "aaaaaaaaa";
        mass[0] = "fffff";

        for (int i = 0; i < mass2.length; i++) {
            mass2[i] = sort.sortMass(mass)[i];
        }


        for (int i = 0; i < mass2.length; i++) {
            System.out.println(mass2[i]);
        }
    }


    @Test
    public void test2() {
        SortMassForLenght sort = new SortMassForLenght();

        String[] mass = new String[10];
        String[] mass2 = new String[10];

        mass[9] = "a";
        mass[8] = "aa";
        mass[7] = "aaa";
        mass[6] = "aaaa";
        mass[5] = "";
        mass[4] = "aaaaaa";
        mass[3] = "";
        mass[2] = "aaaa";
        mass[1] = "aaaaaaaaa";
        mass[0] = "aaaaa";


            mass2 = sort.sortMass(mass);



        for (int i = 0; i < mass2.length; i++) {
            System.out.println(mass2[i]);
        }
    }


    @Test
    public void test3() {
        SortMassForLenght sort = new SortMassForLenght();

        String[] mass = new String[10];
        String[] mass2 = new String[10];

        mass[9] = null;
        mass[8] = "aa";
        mass[7] = "aaa";
        mass[6] = "aaaa";
        mass[5] = "";
        mass[4] = "aaaaaa";
        mass[3] = "";
        mass[2] = "aaaa";
        mass[1] = "aaaaaaaaa";
        mass[0] = "aaaaa";

        mass2 = sort.sortMass(mass);

        for (int i = 0; i < mass2.length; i++) {
            System.out.println(mass2[i]);
        }
    }

    @Test
    public void test4() {
        SortMassForLenght sort = new SortMassForLenght();
        sort.sortMass(null);
    }

}
