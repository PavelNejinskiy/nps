package HomeWorkFrom3107;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by pavel on 02/08/2017.
 */
public class Box {

    List<Integer> list = new ArrayList(5);

    Factory ff = new Factory();

    int capasity = ff.capasity;

    public Box(int capasity) {
        this.capasity = capasity;
    }

    public Box() {
    }

    void add (int ll) throws BoxException
    {
        if (capasity <=0) {throw  new BoxException("The collection capacity is less than or equal zero, capasity: ", capasity);}

        if (list.size() < capasity) {
            list.add(ll);
        }

        if (list.size() >= capasity) {
            list.remove(0);
            list.add(ll);
        }

    }

    List<Integer> get()
    {
        return list;
    }

}
