package level4.lesson4.task005;

/*
Положительное и отрицательное число
*/

import java.io.*;

public class task005 {
    public static void main (String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int is = Integer.parseInt(s);

        if (is > 0) {
            is=is * 2;
            System.out.println(is);
        }
        else if (is < 0) {
            is++;
            System.out.println(is);
        }
        else
            System.out.println(is);
    }
}
