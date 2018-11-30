package level3.lesson8.task001;

/*
План по захвату мира
*/

import java.io.*;

public class task001 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine();
        String sAge = reader.readLine();
        int nAge = Integer.parseInt(sAge);

        System.out.println(name + " захватит мир через " + nAge +" лет. Му-ха-ха!");

    }

}
