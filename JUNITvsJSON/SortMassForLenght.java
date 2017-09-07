package JUNITvsJSON;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by pavel on 05/09/2017.
 */
public class SortMassForLenght {

    String[] sortMass(String [] mass)
    {
        String [] error = new String[1];
        error[0] = "error";

        if (mass == null) {return error;}

        String [] mass2 = new String[mass.length];

        System.out.println(mass.length);

        for (int i = 0; i < mass2.length; i++) {
            mass2[i] = "Error";
        }



        for (int i = 0; i < mass2.length; i++) {
            if(mass[i] == null) {i++;}
           else{ mass2[i] = mass[i];}
        }

        Arrays.sort(mass2, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() > o2.length()){
                    return 1;
                }else{
                    if(o1.length() < o2.length()){
                        return -1;
                    }else{
                        return 0;
                    }
                }
            }
        });

        return mass2;

    }
}
