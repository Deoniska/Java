package level3.lesson12.task003;

import java.io.*;

public class task003 {
    public static void main (String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        int na = Integer.parseInt(a);

        System.out.println("Я буду зарабатывать $" +na + " в час");

    }

}
