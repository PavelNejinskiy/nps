package JUNITvsJSON;

import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by pavel on 07/09/2017.
 */
public class TestSortListForLenght {

    @Test
    public void test1()
    {
        SortListForLenght sortList = new SortListForLenght();

        ArrayList<String> list = new ArrayList<>();

        list.add("a");
        list.add("bb");
        list.add("ccc");
        list.add("add");
        list.add("fffff");
        list.add("fghggfhfh");

        sortList.sortList(list);

    }

    @Test
    public void test2()
    {
        SortListForLenght sortList = new SortListForLenght();
       sortList.sortList(null);
    }

    @Test
    public void test3()
    {
        SortListForLenght sortList = new SortListForLenght();

        ArrayList<String> list = new ArrayList<>();

        list.add("a");
        list.add("bb");
        list.add("ccc");
        list.add("add");
        list.add("fffff");
        list.add("fghggfhfh");
        list.add(null);
        list.add("fghggfhfh");

        sortList.sortList(list);

    }
}
