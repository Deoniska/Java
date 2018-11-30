package level4.lesson6.task003;
/*
Сортировка трех чисел
*/

import java.io.*;
public class task003 {
    public static void main (String[] args) throws Exception {

        int a = read();
        int b = read();
        int c = read();

        System.out.println(sort(a,b,c));

    }

    public static int read () throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int ns = Integer.parseInt(s);
                return ns;
    }

    public static int min (int a, int b) throws Exception {
        if (a > b) {
            return a;
        }
        else {
            return b;
        }
    }

    public static int sort (int a, int b, int c) throws Exception {
        int s = 9999;
        if (min(a,b) > c ) return c;
        else if (min(b,c) > a) return a;
        else if (min(c,a) > b) return b;
        else return s;




    }

}


