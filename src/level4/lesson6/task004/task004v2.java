package level4.lesson6.task004;

/*
Настя или Настя?
*/

import java.io.*;

public class task004v2 {

    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader.readLine();

        int a=name1.length();
        int b=name2.length();

        if (name1.equals(name2))
        {
            System.out.println("Имена идентичны");
        }
        else
        if (a == b)
        {
            System.out.println("Длины имен равны");
        }
    }
}
