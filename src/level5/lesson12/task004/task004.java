package level5.lesson12.task004;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class task004 {

    public static int read() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String c = reader.readLine();
        int nc = Integer.parseInt(c);
        return nc;
    }

    public static void main (String[] args ) throws Exception {
        int a = read();
        int b = read();
        int sum = a+b;

        System.out.println("Summ = " + sum);
    }
}