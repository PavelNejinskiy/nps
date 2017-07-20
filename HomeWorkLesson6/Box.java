package HomeWorkLesson6;

import com.sun.xml.internal.fastinfoset.util.CharArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by pavel on 19/07/2017.
 */
public class Box {

   static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

   static int x;
   static int y;


     public static  void sum () throws IOException {

         System.out.print("Enter the first number: ");
         x = Integer.parseInt(reader.readLine());

         System.out.print("Enter the second number: ");
         y = Integer.parseInt(reader.readLine());
         System.out.println("");



         System.out.println("result = " + (x + y));
         System.out.println("");
        }

    public static  void delete () throws IOException {
        System.out.print("Enter the first number: ");
        x = Integer.parseInt(reader.readLine());

        System.out.print("Enter the second number: ");
        y = Integer.parseInt(reader.readLine());
        System.out.println("");


        System.out.println("result = " + (x - y));
        System.out.println("");
    }

    public static  void multiplication () throws IOException {



        System.out.print("Enter the first number: ");
        x = Integer.parseInt(reader.readLine());

        System.out.print("Enter the second number: ");
        y = Integer.parseInt(reader.readLine());
        System.out.println("");


        System.out.println("result = " + (x * y));
        System.out.println("");
    }

    public static  void division () throws IOException {

        double d;

        System.out.print("Enter the first number: ");
        x = Integer.parseInt(reader.readLine());

        System.out.print("Enter the second number: ");
        y = Integer.parseInt(reader.readLine());
        System.out.println("");

        d = x / y;


        System.out.println("result = " + d);
        System.out.println("");
    }


    public static  void avarage () throws IOException {

        ArrayList list = new ArrayList();
        int sum = 0;
        int x;
        String s = "";

        System.out.println("Please enter some numbers:");
        System.out.println("To finish the input, enter \"end\"");



        while ( !s.equals("end"))
        {
            s = reader.readLine();
            if(!s.equals("end") && testNomber(s) == true) {x = Integer.parseInt(s);

                list.add(x);
            }
        }



            for (int i = 0; i < list.size(); i++) {
                sum = sum + (int)list.get(i);
            }

        System.out.println("The average is: " + (double)(sum/list.size()));
        System.out.println("");
        }


    public static void size() throws IOException {

    ArrayList list = new ArrayList();
    int x;
    String s = "";

        System.out.println("Please enter some numbers:");
        System.out.println("To finish the input, enter \"end\"");


        while ( !s.equals("end"))
    {
        s = reader.readLine();
        if(!s.equals("end") && testNomber(s) == true) {x = Integer.parseInt(s);

            list.add(x);
        }
    }

        System.out.println("The number of entered numbers is: " +list.size());
        System.out.println("");
        }


        public static boolean testNomber(String string){

            char[] h = string.toCharArray();
            boolean value = true;

            for (int i = 0; i < h.length; i++) {
                if(!Character.isDigit(h[i])) {value = false;}
            }

            return value;
        }

}
