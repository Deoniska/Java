package level4.lesson4.task010;

/*
Существует ли пара?
*/

import java.io.*;
public class task010 {
    public static void main (String[] args) throws Exception {
        int n1 = read();
        int n2 = read();
        int n3 = read();

        String s = null;

        if (n1 == n2 & n2 == n3) {
            s = String.valueOf(n1)+ " " + String.valueOf(n2) + " " + String.valueOf(n3);
            //System.out.println(n1 + " " + n2 + " " + n3);
        }
        else {
            if (n1 == n2) {
                System.out.println(n1 + " " + n2);
            }
            if (n2 == n3) {
                System.out.println(n2 + " " + n3);
            }
            if (n1 == n3) {
                System.out.println(n1 + " " + n3);
            }
        }
       System.out.println(s);

    }

    public static int read () throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String snum = reader.readLine();
        int num = Integer.parseInt(snum);
        return num;
    }
}
