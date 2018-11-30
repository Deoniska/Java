package level3.lesson8.task002;
/*
Предсказание на будущее
*/

import java.io.*;

public class task002 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine();
        String t = reader.readLine();
        String d = reader.readLine();
        int t1 = Integer.parseInt(t);
        int d1 = Integer.parseInt(d);

        System.out.println(name + " получает " + t1 +" через " + d1 + " лет");

    }
}
