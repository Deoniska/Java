package level4.lesson4.task008;

/*
Правило треугольника
*/

import java.io.*;

public class task008 {
    public static void main (String[] args) throws Exception {

        int a = reed ();
        int b = reed ();
        int c = reed ();

        if ((a+b>c)&&(a+c>b)&&(c+b>a)) {
            System.out.println("Треугольник существует.");
        }
        else {
            System.out.println("Треугольник не существует.");
        }


    }

    public static int  reed () throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int ns = Integer.parseInt(s);
        return ns;
    }
}
