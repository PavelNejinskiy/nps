package HomeWorkLesson7;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by мори on 22.07.2017.
 *
 *     //кто хочет еще сложнее - N-ный с конца элемнт
 */
public class FindElementFromEndN {

        Iterator<Integer> iterator;

        public FindElementFromEndN(Iterator<Integer> iterator) {
            this.iterator = iterator;
        }

        public int getElementFromTheEnd(ArrayList<Integer> list, int endIndex) {
            // your code here
            int cout =0;
            int k = 0;

            for (int i = 0; i < list.size(); i++) {
                cout++;
            }

            for (int i = 0; i < list.size(); i++) {
                if(i == cout - endIndex) { k = i;}
            }
            return k;
        }
}



