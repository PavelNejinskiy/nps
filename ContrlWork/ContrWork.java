package ContrlWork;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by java3 on 27.07.17.
 */
public class ContrWork {


    static void calc (List<Shape> shape, Color filter ){

        for (int i = 0; i < shape.size(); i++) {
            double d = shape.get(i).size()* (shape.get(i).color().coast());

            System.out.println(d);
        }

    }


    static double findMostExpensiv(List<Shape> shape, Color filter)
    {
        double d = shape.get(0).size()* (shape.get(0).color().coast());

        for (int i = 0; i < shape.size(); i++) {
            double d2 = shape.get(i).size()* (shape.get(i).color().coast());
            if (d < d2) {d = d2;}


        }
       // System.out.println(d);

        return d;
    }

    public static void main(String[] args) {

        List<Shape> list = new ArrayList<>();


        Circle circle = new Circle(25, Color.BLUE);

        Shape squre = new Squre(40, Color.GRIN);
        Shape squre2 = new Squre(40, Color.RED);
        Shape squre3 = new Squre(40, Color.BLUE);
        Shape squre4 = new Squre(40, Color.GRIN);
        Shape squre5 = new Squre(40, Color.GRIN);

        list.add(squre);
        list.add(squre2);
        list.add(squre3);
        list.add(squre4);
        list.add(squre5);

       calc(list, Color.GRIN);

        System.out.println("");

        System.out.println(findMostExpensiv(list, Color.GRIN));






    }
}
