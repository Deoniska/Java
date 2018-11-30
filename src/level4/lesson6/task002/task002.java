package level4.lesson6.task002;
/*
Максимум четырех чисел
*/
import java.io.*;
public class task002 {
    public static void main (String[] args) throws Exception {
        int a = read();
        int b = read();
        int c = read();
        int d = read();

        System.out.println(max4(a,b,c,d));



    }

    public static int read () throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int ns = Integer.parseInt(s);
        return ns;
    }

    public static int max2 (int a, int b) throws Exception {

        if (a>b)  {
            return a;
        }
        else {
            return b;
        }



    }

    public static int max4 (int a, int b, int c, int d) throws Exception {

        if (max2(a,b) > max2(c,d)) {
            return max2(a,b);
        }
        else {
            return max2(c, d);
        }

    }

    }

