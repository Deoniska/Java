package level4.lesson16.task004;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class task004 {
    public static void main(String[] args) throws Exception {
        System.out.println("Меня зовут " + sRead() + "\n" + "Я родился " + iRead() + " " + iRead() + " " + iRead());
    }

    public static String sRead() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        return s;
    }

    public static int iRead() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int rs = Integer.parseInt(s);
        return rs;
    }
}
