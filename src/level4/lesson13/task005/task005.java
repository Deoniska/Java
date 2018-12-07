package level4.lesson13.task005;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Письмо счастья
*/
public class task005 {
    public static void main(String[] args) throws Exception{
        String name = read();
        String text = " любит меня";

        for (int i=0; i<11; i++) {
            System.out.println(name+text);
        }
    }

    public static String read() throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        return s;
    }
}
