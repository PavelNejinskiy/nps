package HomeWorkLesson7;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by мори on 22.07.2017.
 */


public class FindElementFromEnd {

        Iterator<Integer> iterator;

        public FindElementFromEnd(Iterator<Integer> iterator) {
            this.iterator = iterator;
        }

        public int getThirdElementFromTheEnd(ArrayList<Integer> list) {
            // your code here
            int cout =0;
            int k = 0;

            for (int i = 0; i < list.size(); i++) {
                cout++;

            }

            for (int i = 0; i < list.size(); i++) {
                if(i == cout - 3) { k = i;}
            }

            return k;
        }
}








