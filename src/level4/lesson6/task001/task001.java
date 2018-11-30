package level4.lesson6.task001;
/*
Минимум двух чисел
*/

import java.io.*;
public class task001 {
    public static void main (String[] args) throws Exception {

        int a = read();
        int b = read();
        int c;

        if (a > b) {
            c = b;
        } else {
            c = b;
        }
        System.out.println(c);
    }
    public static int read ()throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int ns = Integer.parseInt(s);
        return ns;
    }
}
