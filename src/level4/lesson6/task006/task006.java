package level4.lesson6.task006;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class task006 {
    public static void main (String[] args) throws Exception {
        String name = nameRead();
        int age = ageRead();

        if (age > 20) {
            System.out.println("И 18-ти достаточно");
        }
    }

    public static String nameRead () throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        return s;
    }

    public static int ageRead () throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int ns = Integer.parseInt(s);
        return ns;
    }
}