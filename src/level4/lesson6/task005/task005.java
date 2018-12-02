package level4.lesson6.task005;
/*
18+
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class task005 {
    public static void main (String[] args) throws Exception {

        String a = sRead();
        int b = read();

        if (b<18) {
            System.out.println("Подрасти еще");
        }

    }

    public static String sRead () throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        return s;
    }

    public static int read () throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int ns = Integer.parseInt(s);
        return ns;
    }
}