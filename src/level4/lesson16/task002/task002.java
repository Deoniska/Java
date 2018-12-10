package level4.lesson16.task002;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Как-то средненько
*/
public class task002 {
    public static void main(String[] args) throws Exception {
        int a = read();
        int b = read();
        int c = read();
        sValue(a,b,c);

    }

    public static void sValue(int a, int b, int c) {
        if (a>=b&&a<=c || a<=b&&a>=c)
        {System.out.println(a);}
        else if (b>=a&&b<c|| b>=c&&b<=a)
        {System.out.println (b);}
        else if (c>=a&&c<=b|| c<=a&&c>=b)
        {System.out.println (c);}
    }

    public static int read() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int ns = Integer.parseInt(s);
        return ns;
    }
}
