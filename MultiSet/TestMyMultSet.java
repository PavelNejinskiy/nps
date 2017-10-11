import org.junit.*;

import java.util.HashSet;
import java.util.Set;

public class TestMyMultSet {

    MySet set = new MySet();

    Set set2 = new HashSet<>();
    Set set3 = new HashSet<>();


    @Before
    public void createMulSet()
    {
//        set = new MySet();

        set.add(0);
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add("Mama");


        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);
        set2.add("Mama");


        set3.add(5);
        set3.add(6);
        set3.add("Mama");
    }

    @Test
   public void TestAdd()
    {
        set.add(80);
       set.add("String");

    }

    @Test
    public void TestToSet()
    {
        Set<Object> testSet = (Set<Object>) set.toSet();
    }

    @Test
    public void remuve()
    {
        set.remuve(4);
    }

    @Test
    public void contains()
    {
        System.out.println(set.contain(4));
        System.out.println(set.contain("Mama"));
        System.out.println(set.contain(80));
        System.out.println(set.contain(null));
    }

    @Test
    public void union()
    {
        set2.add(1);
        set2.add(2);
        set2.add(3);

        this.set.union((Set) this.set2);
    }


    @Test
    public void interSet()
    {
        set2 = set.interSet((Set) set3);
    }

    @Test
    public void isSubSet()
    {
        System.out.println(set.isSubSet((Set) set3));

        set3.add(500);

        System.out.println(set.isSubSet((Set) set3));
    }

    @Test
    public void size()
    {
        System.out.println(set.size());
    }

}
