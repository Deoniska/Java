package level4.lesson4.task006;

/*
День недели
*/

import java.io.*;

public class task006 {
    public static void main (String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int ns = Integer.parseInt(s);

        if (ns == 1)
            System.out.println("Понедельник");
        else if (ns == 2)
            System.out.println("Вторник");
        else if (ns == 3)
            System.out.println("Среда");
        else if (ns == 4)
            System.out.println("Четверг");
        else if (ns == 5)
            System.out.println("Пятница");
        else if (ns == 6)
            System.out.println("Суббота");
        else if (ns == 7)
            System.out.println("Воскресенье");
        else
            System.out.println("такого дня недели не существует");
    }
}
