package level5.lesson12.task004;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class taskTest {


/*
Консоль-копилка
*/
public static BufferedReader reader () throws Exception {
    return new BufferedReader(new InputStreamReader(System.in));
}

    public static void main(String[] args) throws Exception {
         BufferedReader reader = reader();

        String line;
        int result = 0;
        while (!(line = reader.readLine()).equals("сумма")) {
            result += Integer.valueOf(line);
        }

        System.out.println(result);//напишите тут ваш код
    }
}


