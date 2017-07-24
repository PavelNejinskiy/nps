package HomeWorkLesson7;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by мори on 22.07.2017.
 */


public class FindElementFromEndv2 {

        Iterator<Integer> iterator;

        public FindElementFromEndv2(Iterator<Integer> iterator) {
            this.iterator = iterator;
        }

    public int getThirdElementFromTheEnd(Iterator<Integer> iterator) {
        // your code here
        int count =0;
        int k = 0;
        int forReturn = 0;

        if (iterator != null) {
            while (iterator.hasNext()) {
                iterator.next();
                count++;
            }

            if ( count >= 3 ) {

                while (iterator.hasNext()) {

                    forReturn = iterator.next();
                    k++;

                    if (k == count - 3) {
                        return forReturn;
                    }
                }
            }
        }
        return 0;
    }
}








