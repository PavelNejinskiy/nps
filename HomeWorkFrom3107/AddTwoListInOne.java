package HomeWorkFrom3107;

import com.sun.scenario.effect.Merge;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pavel on 02/08/2017.
 */
public class AddTwoListInOne {

  static List<Integer> Merger(List x1, List x2)
    {
        List list = new ArrayList();

        int x = 0;

        if (x1.size() > x2.size()) { x = x1.size();}
        else {x = x2.size();}

        for (int i = 0; i < x; i++) {

            if (x1.get(i)!=null) {list.add(x1.get(i));}
            if (x2.get(i)!=null) {list.add(x2.get(i));}
        }
        return list;
    }

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();
        List<Integer> list4 = new ArrayList<>();

        double d = 0;

        for (int i = 0; i < 20; i++) {
            list1.add(i);
        }

        for (int i = 0; i < 20; i++) {
            list2.add(i);
        }

        for (int i = 0; i < 20; i++) {
            d = Math.random()*50;
            list3.add((int)d);
        }

        for (int i = 0; i < 20; i++) {
            d = Math.random()*50;
            list4.add((int)d);
        }

        System.out.println(Merger(list1,list2));

        System.out.println(Merger(list3,list4));


    }

}
