package level4.lesson6.task004;

/*
Настя или Настя?
*/


import java.io.*;

public class task004 {

    public static void main (String[] args) throws Exception {

        String name1 = read();
        String name2 = read();

        int cr = countRead(name1);
        int cr2 = countRead(name2);

        System.out.println(name1);
        System.out.println(cr2);


    }

    public static String read () throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        return s;

    }


    public static int countRead(String name1) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int ns = s.length();
        return ns;
    }



}
