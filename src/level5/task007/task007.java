package level5.task007;
/*
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class task007 {
    public static void main(String[] args) throws Exception {
        crt();
    }

    public static void crt() throws Exception {

        double summ = 0;
        double count = 0;

        while(true) {
            double d = read();
            if (d==-1) {
                break;
            }
            summ=summ+d;
            count++;
        }
        System.out.println(summ / count);
    }


    public static double read() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        double ns = Double.parseDouble(s);
        return ns;
    }
}
