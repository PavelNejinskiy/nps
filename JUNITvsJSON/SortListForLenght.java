package JUNITvsJSON;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by pavel on 07/09/2017.
 */
public class SortListForLenght {

    ArrayList<String> sortList(List<String> list) {
        ArrayList<String> error = new ArrayList<>();

        error.add("Error");

        if (list == null) {
            return error;
        }

        ArrayList<String> list2 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != null) list2.add(list.get(i));
        }

        Collections.sort(list2, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });

        return list2;

    }
}
