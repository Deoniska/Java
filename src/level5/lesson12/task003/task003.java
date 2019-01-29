package level5.lesson12.task003;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class task003 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line;
        int result = 0;
        while (!(line = reader.readLine()).equals("сумма")) {
            result += Integer.valueOf(line);
        }

        System.out.println(result);//напишите тут ваш код
    }
}

