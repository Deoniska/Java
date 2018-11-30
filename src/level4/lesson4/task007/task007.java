package level4.lesson4.task007;
/*
Количество дней в году
*/

import java.io.*;

public class task007 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int yers = Integer.parseInt(s);
        String t;

        if (yers % 400 == 0) {
             t = "количество дней в году: 366";
        }
        else if ((yers % 400) % 100 ==0 ) {
            t = "количество дней в году: 365";
        }
        else if (((yers % 400) % 100)%4 ==0 ) {
            t = "количество дней в году: 366";
        }
        else t = "количество дней в году: 365";

        System.out.println(t);
    }
}
