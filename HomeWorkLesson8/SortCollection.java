package HomeWorkLesson8;

import java.util.ArrayList;

/**
 * Created by pavel on 26/07/2017.
 */
public class SortCollection {

    ArrayList<Integer> sort(ArrayList<Integer> list, int n) {
        ArrayList<Integer> sortList = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i) + list.get(j) == n) {
                    sortList.add(list.get(i));
                    sortList.add(list.get(j));
                }
            }
        }

        return sortList;
    }
}
