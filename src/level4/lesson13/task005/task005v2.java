package level4.lesson13.task005;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Письмо счастья
*/
public class task005v2 {
    public static void main(String[] args) throws Exception{
        String name = read();
        String text = " любит меня";
        int i = 0;

        while (i<11){
            System.out.println(name+text);
            i++;
        }
    }

    public static String read() throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        return s;
    }
}
