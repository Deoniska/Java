package level4.lesson10.task003;
/*
Хорошего много не бывает
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class task003v2 {
    public static void main(String[] args) throws Exception{

        String s = sRread();
        int n = nRead();

        while (n>0) {
            System.out.println(s);
            n--;
        }

    }

    public static int nRead() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int ns = Integer.parseInt(s);
        return ns;
    }

    public static String sRread() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        return s;
    }

}
