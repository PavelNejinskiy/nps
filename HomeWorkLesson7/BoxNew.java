package HomeWorkLesson7;

import com.sun.xml.internal.fastinfoset.util.CharArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


/**
 * Created by мори on 22.07.2017.
 */
public class BoxNew  <T extends Number>{


    T number;

    public BoxNew(T number) {
        this.number = number;
    }

    public T getNumber() {
        return number;
    }

    int sum( int x, int y)
    {
     return (x + y) ;
    }

    int delete (int x, int y)  {
           return (x - y);
    }

    int multiplication (int x, int y)  {

    return (x * y);
    }

    double division (T x , T y) {

        double d1 = (double) x;
        double d2 = (double) y;

     return (d1 / d2);
    }

   double avarage (ArrayList<T> list) {

        double d = 0;

       for (int i = 0; i < list.size(); i++) {
           d = d + (double)list.get(i);
       }
        return (d / list.size());
    }


     int size( T[] mass) {
        return mass.length;
     }

}
