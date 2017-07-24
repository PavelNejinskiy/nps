package HomeWorkLesson7;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by мори on 22.07.2017.
 *
 *     //кто хочет еще сложнее - N-ный с конца элемнт
 */
public class FindElementFromEndNv2 {

        Iterator<Integer> iterator;

        public FindElementFromEndNv2(Iterator<Integer> iterator) {
            this.iterator = iterator;
        }

        public int getElementFromTheEnd(int endIndex) {
            // your code here
            int count =0;
            int k = 0;
            int forReturn = 0;

            if (iterator != null) {
                while (iterator.hasNext()) {
                    iterator.next();
                    count++;
                }

                if ( count >= endIndex ) {

                    while (iterator.hasNext()) {

                        forReturn = iterator.next();
                        k++;

                        if (k == count - endIndex) {
                            return forReturn;
                        }
                    }
                }
            }
            return 0;
        }
}



