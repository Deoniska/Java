package level4.lesson6.task007;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class task007 {

    public static void main (String[] args) throws Exception {

        int a = read();
        int b = read();
        int c = read();

        System.out.println(sort(a,b,c));

    }

    public static int read () throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int ns = Integer.parseInt(s);
        return ns;
    }

    public static int sort (int a, int b, int c) {
        int min = 0;
        if (a==b) { min =c;}
        else if (a==c) {min = b;}
        else if (b==c) {min = a;}
        else {
            System.out.println("где-то лоханулся");
        }
        return min;
    }
}
