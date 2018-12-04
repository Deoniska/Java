package level4.lesson7.task001;
/*
Ярлыки и числа
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class task001 {
    public static void main (String[] args) throws Exception {

        int c = read();
        System.out.println(sort(c));

    }

    public static int read () throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int ns = Integer.parseInt(s);
        return ns;
    }

    public static String sort (int n) {
        String a = "положительное четное число";
        String b = "положительное нечетное число";
        String d = "ноль";
        String e = "отрицательное четное число";
        String f = "отрицательное нечетное число";
        String error = "где-то оишбся";

        if ((n>0)&&(n%2==0)) return a;
        else if ((n>0)&&(n%2!=0)) return b;
        else if (n==0) return d;
        else if ((n<0)&&(n%2==0))return e;
        else if ((n<0)&&(n%2!=0)) return f;
        else return error;
    }
}
